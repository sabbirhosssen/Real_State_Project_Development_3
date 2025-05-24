package com.sabbirhosssen.realStateApp.controller;

import com.sabbirhosssen.realStateApp.model.Subscribe;
import com.sabbirhosssen.realStateApp.services.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class SubscribeController {
    @Autowired
    private SubscribeService sub;
    @RequestMapping("/s")
    public String  geet(){
        return "hello starting the Notation Real Estate App subscribe";
    }

//    @PostMapping("/subscribe")
//    public Subscribe addSubscribe(@RequestBody Subscribe subscribe){
//        return sub.addSubscribe(subscribe);
//    }
    @PostMapping("/subscribe")
    public ResponseEntity<?> AddSubscribe(@RequestBody Subscribe subscribe){
        try {
            Subscribe subscribe1 = sub.addSubscribe(subscribe);
            return new ResponseEntity<>(subscribe1, org.springframework.http.HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/subscribes")
    public List<Subscribe> getSubscribe(){
        return sub.getAllSubscribe();
    }
}
