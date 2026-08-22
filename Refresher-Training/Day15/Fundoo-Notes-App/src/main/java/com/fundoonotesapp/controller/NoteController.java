package com.fundoonotesapp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fundoonotesapp.dto.NoteRequest;
import com.fundoonotesapp.dto.NoteResponse;
import com.fundoonotesapp.security.CustomUserDetails;
import com.fundoonotesapp.service.NoteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/notes")
public class NoteController {

	private final NoteService noteService;

	public NoteController(NoteService noteService) {
		this.noteService = noteService;
	}

	private int currentUserId() {

		CustomUserDetails userDetails = (CustomUserDetails) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();

		return userDetails.getUserId();
	}

	@PostMapping
	public ResponseEntity<NoteResponse> createNote(@Valid @RequestBody NoteRequest request) {

		NoteResponse response = noteService.createNote(request);

		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}

	@GetMapping
	public ResponseEntity<List<NoteResponse>> getMyNotes(@RequestParam(required = false) String state,
			@RequestParam(required = false) Boolean pinned, @RequestParam(required = false) String tag) {

		List<NoteResponse> notes = noteService.getMyNotes(state, pinned, tag);

		return ResponseEntity.ok(notes);
	}

	@GetMapping("/search")
	public ResponseEntity<List<NoteResponse>> searchNotes(@RequestParam(required = false) String title,
			@RequestParam(required = false) String state, @RequestParam(required = false) String tag) {

		List<NoteResponse> notes = noteService.searchNotes(title, state, tag, currentUserId());

		return ResponseEntity.ok(notes);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteNote(@PathVariable int id) {

		noteService.deleteNote(id);

		return ResponseEntity.ok("Note deleted successfully");
	}

	@PutMapping("/{id}")
	public ResponseEntity<NoteResponse> updateNote(@PathVariable int id, @Valid @RequestBody NoteRequest request) {

		NoteResponse response = noteService.updateNote(id, request);

		return ResponseEntity.ok(response);
	}

	@PatchMapping("/{id}/archive")
	public ResponseEntity<NoteResponse> archiveNote(@PathVariable int id) {

		return ResponseEntity.ok(noteService.archiveNote(id, currentUserId()));
	}

	@PatchMapping("/{id}/trash")
	public ResponseEntity<NoteResponse> trashNote(@PathVariable int id) {

		return ResponseEntity.ok(noteService.trashNote(id, currentUserId()));
	}

	@PatchMapping("/{id}/restore")
	public ResponseEntity<NoteResponse> restoreNote(@PathVariable int id) {

		return ResponseEntity.ok(noteService.restoreNote(id, currentUserId()));
	}

	@PatchMapping("/{id}/pin")
	public ResponseEntity<NoteResponse> pinNote(@PathVariable int id) {

		return ResponseEntity.ok(noteService.pinNote(id, currentUserId()));
	}

	@PatchMapping("/{id}/tags/{tagName}")
	public ResponseEntity<NoteResponse> addTagToNote(@PathVariable int id, @PathVariable String tagName) {

		return ResponseEntity.ok(noteService.addTagToNote(id, currentUserId(), tagName));
	}

}