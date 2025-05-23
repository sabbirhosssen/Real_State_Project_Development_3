package com.sabbirhosssen.realStateApp.controller;

import com.sabbirhosssen.realStateApp.model.Subscribe;
import com.sabbirhosssen.realStateApp.services.SubscribeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @PostMapping("/subscribe")
    public Subscribe addSubscribe(Subscribe subscribe){
        return sub.addSubcribe(subscribe);
    }
}
