package com.fundoonotesapp.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.List;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "notes")
@Data
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int noteId;

    @Column(nullable = false)
    private String title;

    @Column(length = 2000)
    private String content;

    private LocalDateTime createdAt = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User owner;
    
    
    public enum NoteState {
        ACTIVE,ARCHIVED,TRASHED
    }

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private NoteState state = NoteState.ACTIVE;

    private boolean pinned = false;
       
    
    @ManyToMany
    @JoinTable(
        name = "note_tags",
        joinColumns = @JoinColumn(name = "note_id"),
        inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    private List<Tag> tags = new ArrayList<>();
    
    
    @Column(name = "reminder_at")
    private LocalDateTime reminderAt;
    
}