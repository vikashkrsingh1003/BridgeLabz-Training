package com.fundoonotesapp.service;

import java.util.List;

import com.fundoonotesapp.dto.NoteRequest;
import com.fundoonotesapp.dto.NoteResponse;

public interface NoteService {

    NoteResponse createNote(NoteRequest request);

    List<NoteResponse> getMyNotes();

    void deleteNote(int noteId);

    NoteResponse updateNote(int noteId, NoteRequest request);
}