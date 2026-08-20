package com.fundoonotesapp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fundoonotesapp.entity.Note;
import com.fundoonotesapp.entity.User;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {

    List<Note> findByOwner(User owner);

    Optional<Note> findByNoteIdAndOwner(int noteId, User owner);
}