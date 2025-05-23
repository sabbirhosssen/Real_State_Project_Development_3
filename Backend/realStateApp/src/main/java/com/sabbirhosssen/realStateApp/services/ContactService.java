package com.sabbirhosssen.realStateApp.services;

import com.sabbirhosssen.realStateApp.model.Contact;
import com.sabbirhosssen.realStateApp.model.Product;
import com.sabbirhosssen.realStateApp.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository repo;



    public Contact addContact(Contact contact) {
        return repo.save(contact);
    }

    public List<Contact> getAllContact() {
        return repo.findAll();
    }
}
