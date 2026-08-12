package com.ContactApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ContactApp.dto.ContactDto;
import com.ContactApp.mapper.ContactMapper;
import com.ContactApp.model.Contact;
import com.ContactApp.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

    private final ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public ContactDto createContact(ContactDto contactDto) {

        Contact contact = ContactMapper.toEntity(contactDto);

        Contact savedContact = contactRepository.save(contact);

        return ContactMapper.toDto(savedContact);
    }

    @Override
    public ContactDto getContactById(int id) {

        Contact contact = contactRepository.findById(id)
                .orElseThrow(() ->
                    new RuntimeException("Contact not found with id: " + id)
                );

        return ContactMapper.toDto(contact);
    }

    @Override
    public List<ContactDto> getAllContacts() {

        return contactRepository.findAll()
                .stream()
                .map(ContactMapper::toDto)
                .toList();
    }

    @Override
    public ContactDto updateContact(int id, ContactDto contactDto) {

        Contact existingContact = contactRepository.findById(id)
                .orElseThrow(() ->
                    new RuntimeException("Contact not found with id: " + id)
                );

        existingContact.setName(contactDto.getName());
        existingContact.setEmail(contactDto.getEmail());
        existingContact.setPhoneNumber(contactDto.getPhoneNumber());
        existingContact.setAltphoneNumber(
                contactDto.getAltphoneNumber()
        );

        Contact updatedContact =
                contactRepository.save(existingContact);

        return ContactMapper.toDto(updatedContact);
    }

    @Override
    public void deleteContact(int id) {

        Contact contact = contactRepository.findById(id)
                .orElseThrow(() ->
                    new RuntimeException("Contact not found with id: " + id)
                );

        contactRepository.delete(contact);
    }
}