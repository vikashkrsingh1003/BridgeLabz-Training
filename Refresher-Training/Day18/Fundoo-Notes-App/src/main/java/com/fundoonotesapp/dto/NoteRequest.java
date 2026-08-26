package com.fundoonotesapp.dto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class NoteRequest {

    @NotBlank(message = "Title is required")
    private String title;

    @Size(max = 2000, message = "Content cannot exceed 2000 characters")
    private String content;
    
    private LocalDateTime reminderAt;
}