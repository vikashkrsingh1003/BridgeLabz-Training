package com.ContactApp.controller;

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

import com.ContactApp.dto.ContactDto;
import com.ContactApp.service.ContactService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }


    @PostMapping
    public ResponseEntity<ContactDto> createContact(
            @Valid @RequestBody ContactDto contactDto) {

        ContactDto savedContact =
                contactService.createContact(contactDto);

        return new ResponseEntity<>(
                savedContact,
                HttpStatus.CREATED
        );
    }

    
    @GetMapping
    public ResponseEntity<List<ContactDto>> getAllContacts() {

        List<ContactDto> contacts =
                contactService.getAllContacts();

        return ResponseEntity.ok(contacts);
    }

   
    @GetMapping("/{id}")
    public ResponseEntity<ContactDto> getContactById(
            @PathVariable int id) {

        ContactDto contact =
                contactService.getContactById(id);

        return ResponseEntity.ok(contact);
    }

   
    @PutMapping("/{id}")
    public ResponseEntity<ContactDto> updateContact(
            @PathVariable int id,
            @Valid @RequestBody ContactDto contactDto) {

        ContactDto updatedContact =
                contactService.updateContact(
                        id,
                        contactDto
                );

        return ResponseEntity.ok(updatedContact);
    }

   
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(
            @PathVariable int id) {

        contactService.deleteContact(id);

        return ResponseEntity.noContent().build();
    }
}