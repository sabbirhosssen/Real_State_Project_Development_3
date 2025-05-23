package com.sabbirhosssen.realStateApp.controller;

import com.sabbirhosssen.realStateApp.model.Contact;
import com.sabbirhosssen.realStateApp.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ContactController {

    @Autowired
    private ContactService  con;
    @RequestMapping("/c")
    public String  geet_es(){
        return "hello starting the Notation Real Estate App app";
    }

    @PostMapping("/contact")
    public  Contact addContact(@RequestBody Contact contact){
        return con.addContact(contact);
    }

    @GetMapping("/contacts")
    public List<Contact> getContact(){
        return con.getAllContact();

    }



    //THis is functionality is required for only image
//    public ResponseEntity<?> AddContact(@RequestPart Contact contact){
//        try {
//            Contact contact1 = con.addContact(contact);
//            return new ResponseEntity<>(contact1, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }

}
