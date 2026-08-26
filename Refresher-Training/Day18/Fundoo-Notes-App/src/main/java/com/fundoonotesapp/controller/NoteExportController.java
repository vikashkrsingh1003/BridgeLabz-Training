package com.fundoonotesapp.controller;

import java.io.ByteArrayInputStream;
import java.util.List;

import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundoonotesapp.entity.Note;
import com.fundoonotesapp.entity.User;
import com.fundoonotesapp.exception.UserNotFoundException;
import com.fundoonotesapp.repository.NoteRepository;
import com.fundoonotesapp.repository.UserRepository;
import com.fundoonotesapp.service.NoteExportService;

@RestController
@RequestMapping("/notes")
public class NoteExportController {

	private final NoteRepository noteRepository;
	private final NoteExportService noteExportService;
	private final UserRepository userRepository;

	public NoteExportController(NoteRepository noteRepository, NoteExportService noteExportService,
			UserRepository userRepository) {

		this.noteRepository = noteRepository;
		this.noteExportService = noteExportService;
		this.userRepository = userRepository;
	}

	@GetMapping("/export")
	public ResponseEntity<InputStreamResource> exportNotes(Authentication authentication) {

		// Get logged-in user's email from JWT
		String email = authentication.getName();

		// Find current user
		User user = userRepository.findByEmail(email).orElseThrow(() -> new UserNotFoundException("User not found"));

		// Get only current user's notes
		List<Note> notes = noteRepository.findByOwner(user);

		// Create Excel file
		ByteArrayInputStream inputStream = noteExportService.exportNotes(notes);

		HttpHeaders headers = new HttpHeaders();

		headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=notes.xlsx");

		return ResponseEntity.ok().headers(headers)
				.contentType(
						MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"))
				.body(new InputStreamResource(inputStream));
	}
}