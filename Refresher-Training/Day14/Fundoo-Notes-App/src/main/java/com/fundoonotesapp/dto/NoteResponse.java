package com.fundoonotesapp.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class NoteResponse {

    private int noteId;

    private String title;

    private String content;

    private LocalDateTime createdAt;
}