package com.ContactApp.mapper;

import com.ContactApp.model.Contact;
import com.ContactApp.dto.ContactDto;


public class ContactMapper {

    public static ContactDto toDto(Contact contact) {

        ContactDto dto = new ContactDto();

        dto.setId(contact.getId());
        dto.setName(contact.getName());
        dto.setEmail(contact.getEmail());
        dto.setPhoneNumber(contact.getPhoneNumber());
        dto.setAltphoneNumber(contact.getAltphoneNumber());

        return dto;
    }

    public static Contact toEntity(ContactDto dto) {

        Contact contact = new Contact();

        contact.setId(dto.getId());
        contact.setName(dto.getName());
        contact.setEmail(dto.getEmail());
        contact.setPhoneNumber(dto.getPhoneNumber());
        contact.setAltphoneNumber(dto.getAltphoneNumber());

        return contact;
    }
}