package com.fundoonotesapp.service;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.fundoonotesapp.dto.NoteRequest;
import com.fundoonotesapp.dto.NoteResponse;
import com.fundoonotesapp.entity.Note;
import com.fundoonotesapp.entity.Tag;
import com.fundoonotesapp.entity.User;
import com.fundoonotesapp.repository.NoteRepository;
import com.fundoonotesapp.repository.TagRepository;
import com.fundoonotesapp.repository.UserRepository;
import com.fundoonotesapp.specification.NoteSpecifications;

@Service
public class NoteServiceImpl implements NoteService {

	private final NoteRepository noteRepository;

	private final UserRepository userRepository;

	private final TagRepository tagRepository;

	public NoteServiceImpl(NoteRepository noteRepository, UserRepository userRepository, TagRepository tagRepository) {

		this.noteRepository = noteRepository;
		this.userRepository = userRepository;
		this.tagRepository = tagRepository;
	}

	@Override
	public NoteResponse createNote(NoteRequest request) {

		User currentUser = getCurrentUser();

		Note note = new Note();

		note.setTitle(request.getTitle());
		note.setContent(request.getContent());

		// Owner comes from JWT, not from client
		note.setOwner(currentUser);

		Note savedNote = noteRepository.save(note);

		return convertToResponse(savedNote);
	}

	@Override
	public List<NoteResponse> getMyNotes(String state, Boolean pinned, String tag) {

		User currentUser = getCurrentUser();

		List<Note> notes;

		// Filter by tag
		if (tag != null && !tag.isBlank()) {

			notes = noteRepository.findByOwnerAndTagsName(currentUser, tag);

		}

		// Filter by state
		else if (state != null && !state.isBlank()) {

			Note.NoteState noteState = Note.NoteState.valueOf(state.toUpperCase());

			notes = noteRepository.findByOwnerAndState(currentUser, noteState);

		}

		// Filter pinned notes
		else if (Boolean.TRUE.equals(pinned)) {

			notes = noteRepository.findByOwnerAndPinnedTrueAndStateNot(currentUser, Note.NoteState.TRASHED);

		}

		// Default → only ACTIVE notes
		else {

			notes = noteRepository.findByOwnerAndState(currentUser, Note.NoteState.ACTIVE);
		}

		return notes.stream().map(this::convertToResponse).toList();
	}

	@Override
	public void deleteNote(int noteId) {

		User currentUser = getCurrentUser();

		Note note = noteRepository.findByNoteIdAndOwner(noteId, currentUser)
				.orElseThrow(() -> new IllegalArgumentException("Note not found"));

		noteRepository.delete(note);
	}

	@Override
	public NoteResponse updateNote(int noteId, NoteRequest request) {

		User currentUser = getCurrentUser();

		Note existingNote = noteRepository.findByNoteIdAndOwner(noteId, currentUser)
				.orElseThrow(() -> new IllegalArgumentException("Note not found"));

		existingNote.setTitle(request.getTitle());

		existingNote.setContent(request.getContent());

		Note updatedNote = noteRepository.save(existingNote);

		return convertToResponse(updatedNote);
	}

	@Override
	public NoteResponse archiveNote(int noteId, int userId) {

		Note note = getOwnedNoteOrThrow(noteId, userId);

		note.setState(Note.NoteState.ARCHIVED);

		// Archived note cannot remain pinned
		note.setPinned(false);

		Note savedNote = noteRepository.save(note);

		return convertToResponse(savedNote);
	}

	@Override
	public NoteResponse trashNote(int noteId, int userId) {

		Note note = getOwnedNoteOrThrow(noteId, userId);

		note.setState(Note.NoteState.TRASHED);

		// Trashed note cannot remain pinned
		note.setPinned(false);

		Note savedNote = noteRepository.save(note);

		return convertToResponse(savedNote);
	}

	@Override
	public NoteResponse restoreNote(int noteId, int userId) {

		Note note = getOwnedNoteOrThrow(noteId, userId);

		note.setState(Note.NoteState.ACTIVE);

		Note savedNote = noteRepository.save(note);

		return convertToResponse(savedNote);
	}

	@Override
	public NoteResponse pinNote(int noteId, int userId) {

		Note note = getOwnedNoteOrThrow(noteId, userId);

		// Trashed notes cannot be pinned
		if (note.getState() == Note.NoteState.TRASHED) {

			throw new IllegalStateException("Cannot pin a note that is in Trash");
		}

		note.setPinned(true);

		Note savedNote = noteRepository.save(note);

		return convertToResponse(savedNote);
	}

	@Override
	public List<NoteResponse> searchNotes(String title, String state, String tag, int userId) {

		User owner = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));

		Note.NoteState noteState = null;

		if (state != null && !state.isBlank()) {

			noteState = Note.NoteState.valueOf(state.toUpperCase());
		}

		var specification = NoteSpecifications.search(owner, title, noteState, tag);

		List<Note> notes = noteRepository.findAll(specification);

		return notes.stream().map(this::convertToResponse).toList();
	}

	@Override
	public NoteResponse addTagToNote(int noteId, int userId, String tagName) {

		Note note = getOwnedNoteOrThrow(noteId, userId);

		Tag tag = tagRepository.findByName(tagName).orElseGet(() -> tagRepository.save(new Tag(tagName)));

		note.getTags().add(tag);

		Note savedNote = noteRepository.save(note);

		return convertToResponse(savedNote);
	}

	private Note getOwnedNoteOrThrow(int noteId, int userId) {

		User owner = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));

		return noteRepository.findByNoteIdAndOwner(noteId, owner)
				.orElseThrow(() -> new IllegalArgumentException("Note not found"));
	}

	private User getCurrentUser() {

		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		String email = authentication.getName();

		return userRepository.findByEmail(email).orElseThrow(() -> new IllegalArgumentException("User not found"));
	}

	private NoteResponse convertToResponse(Note note) {

		NoteResponse response = new NoteResponse();

		response.setNoteId(note.getNoteId());
		response.setTitle(note.getTitle());
		response.setContent(note.getContent());
		response.setCreatedAt(note.getCreatedAt());

		response.setState(note.getState());

		response.setPinned(note.isPinned());

		response.setTags(note.getTags().stream().map(Tag::getName).toList());

		return response;
	
	}

}