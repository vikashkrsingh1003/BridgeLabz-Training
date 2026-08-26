package com.fundoonotesapp.service;

import java.util.List;

import com.fundoonotesapp.dto.NoteRequest;
import com.fundoonotesapp.dto.NoteResponse;
import com.fundoonotesapp.dto.ReminderRequest;

public interface NoteService {

	NoteResponse createNote(NoteRequest request);

	List<NoteResponse> getMyNotes(String state, Boolean pinned, String tag);

	void deleteNote(int noteId);

	NoteResponse updateNote(int noteId, NoteRequest request);

	NoteResponse archiveNote(int noteId, int userId);

	NoteResponse trashNote(int noteId, int userId);

	NoteResponse restoreNote(int noteId, int userId);

	NoteResponse pinNote(int noteId, int userId);

	List<NoteResponse> searchNotes(String title, String state, String tag, int userId);

	NoteResponse addTagToNote(int noteId, int userId, String tagName);

	NoteResponse addReminder(int noteId, ReminderRequest request);

}