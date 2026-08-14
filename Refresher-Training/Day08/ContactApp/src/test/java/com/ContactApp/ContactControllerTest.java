package com.ContactApp;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ContactApp.controller.ContactController;
import com.ContactApp.dto.ContactDto;
import com.ContactApp.service.ContactService;

class ContactControllerTest {

    private ContactService contactService;
    private ContactController contactController;

    @BeforeEach
    void setUp() {
        contactService = mock(ContactService.class);
        contactController = new ContactController(contactService);
    }

    @Test
    void createContact() {

        ContactDto dto = new ContactDto();

        when(contactService.createContact(dto)).thenReturn(dto);

        var response = contactController.createContact(dto);

        assertEquals(201, response.getStatusCode().value());
        assertEquals(dto, response.getBody());

        verify(contactService).createContact(dto);
    }

    @Test
    void getAllContacts() {

        List<ContactDto> contacts = List.of(new ContactDto());

        when(contactService.getAllContacts()).thenReturn(contacts);

        var response = contactController.getAllContacts();

        assertEquals(200, response.getStatusCode().value());
        assertEquals(contacts, response.getBody());
    }

    @Test
    void getContactById() {

        ContactDto dto = new ContactDto();

        when(contactService.getContactById(1)).thenReturn(dto);

        var response = contactController.getContactById(1);

        assertEquals(200, response.getStatusCode().value());
        assertEquals(dto, response.getBody());
    }

    @Test
    void updateContact() {

        ContactDto dto = new ContactDto();

        when(contactService.updateContact(1, dto)).thenReturn(dto);

        var response = contactController.updateContact(1, dto);

        assertEquals(200, response.getStatusCode().value());
        assertEquals(dto, response.getBody());
    }

    @Test
    void deleteContact() {

        var response = contactController.deleteContact(1);

        assertEquals(204, response.getStatusCode().value());

        verify(contactService).deleteContact(1);
    }
}