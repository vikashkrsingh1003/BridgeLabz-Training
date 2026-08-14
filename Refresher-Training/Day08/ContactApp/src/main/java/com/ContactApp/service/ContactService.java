package com.ContactApp.service;

import java.util.List;

import com.ContactApp.dto.ContactDto;

public interface ContactService {

    ContactDto createContact(ContactDto contactDto);

    ContactDto getContactById(int id);

    List<ContactDto> getAllContacts();

    ContactDto updateContact(int id, ContactDto contactDto);

    void deleteContact(int id);
}