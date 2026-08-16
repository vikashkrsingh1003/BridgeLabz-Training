package com.ContactApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ContactApp.model.Contact;



public interface ContactRepository extends JpaRepository<Contact, Integer> {

}