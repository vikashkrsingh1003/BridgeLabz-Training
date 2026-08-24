package com.fundoonotesapp.dto;

import java.time.LocalDateTime;
import java.util.List;

import com.fundoonotesapp.entity.Note.NoteState;


import lombok.Data;

@Data
public class NoteResponse {

	private int noteId;

	private String title;

	private String content;

	private LocalDateTime createdAt;

	private NoteState state;
	private boolean pinned;

	private List<String> tags;
	
	private LocalDateTime reminderAt;

	
}