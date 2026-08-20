package com.fundoonotesapp.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fundoonotesapp.dto.NoteRequest;
import com.fundoonotesapp.dto.NoteResponse;
import com.fundoonotesapp.service.NoteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    public ResponseEntity<NoteResponse> createNote(
            @Valid @RequestBody NoteRequest request) {

        NoteResponse response =
                noteService.createNote(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    @GetMapping
    public ResponseEntity<List<NoteResponse>> getMyNotes() {

        List<NoteResponse> notes =
                noteService.getMyNotes();

        return ResponseEntity.ok(notes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteNote(
            @PathVariable int id) {

        noteService.deleteNote(id);

        return ResponseEntity.ok(
                "Note deleted successfully");
    }

    @PutMapping("/{id}")
    public ResponseEntity<NoteResponse> updateNote(
            @PathVariable int id,
            @Valid @RequestBody NoteRequest request) {

        NoteResponse response =
                noteService.updateNote(id, request);

        return ResponseEntity.ok(response);
    }
}