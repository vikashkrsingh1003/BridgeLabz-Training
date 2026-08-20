package com.fundoonotesapp.service;

import java.util.List;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.fundoonotesapp.dto.NoteRequest;
import com.fundoonotesapp.dto.NoteResponse;
import com.fundoonotesapp.entity.Note;
import com.fundoonotesapp.entity.User;
import com.fundoonotesapp.repository.NoteRepository;
import com.fundoonotesapp.repository.UserRepository;

@Service
public class NoteServiceImpl implements NoteService {

    private final NoteRepository noteRepository;

    private final UserRepository userRepository;

    public NoteServiceImpl(
            NoteRepository noteRepository,
            UserRepository userRepository) {

        this.noteRepository = noteRepository;
        this.userRepository = userRepository;
    }

    @Override
    public NoteResponse createNote(NoteRequest request) {

        User currentUser = getCurrentUser();

        Note note = new Note();

        note.setTitle(request.getTitle());
        note.setContent(request.getContent());

        //Owner comes from JWT, not from client request
        note.setOwner(currentUser);

        Note savedNote = noteRepository.save(note);

        return convertToResponse(savedNote);
    }

    @Override
    public List<NoteResponse> getMyNotes() {

        User currentUser = getCurrentUser();

        List<Note> notes =
                noteRepository.findByOwner(currentUser);

        return notes.stream()
                .map(this::convertToResponse)
                .toList();
    }

    @Override
    public void deleteNote(int noteId) {

        User currentUser = getCurrentUser();

        Note note = noteRepository
                .findByNoteIdAndOwner(noteId, currentUser)
                .orElseThrow(() ->
                        new IllegalArgumentException(
                                "Note not found"));

        noteRepository.delete(note);
    }

    @Override
    public NoteResponse updateNote(
            int noteId,
            NoteRequest request) {

        User currentUser = getCurrentUser();

        Note existingNote = noteRepository
                .findByNoteIdAndOwner(noteId, currentUser)
                .orElseThrow(() ->
                        new IllegalArgumentException(
                                "Note not found"));

        existingNote.setTitle(request.getTitle());
        existingNote.setContent(request.getContent());

        Note updatedNote =
                noteRepository.save(existingNote);

        return convertToResponse(updatedNote);
    }

    private User getCurrentUser() {

        Authentication authentication =
                SecurityContextHolder
                        .getContext()
                        .getAuthentication();

        String email = authentication.getName();

        return userRepository
                .findByEmail(email)
                .orElseThrow(() ->
                        new IllegalArgumentException(
                                "User not found"));
    }

    private NoteResponse convertToResponse(Note note) {

        NoteResponse response = new NoteResponse();

        response.setNoteId(note.getNoteId());
        response.setTitle(note.getTitle());
        response.setContent(note.getContent());
        response.setCreatedAt(note.getCreatedAt());

        return response;
    }
}