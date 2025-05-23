package com.sabbirhosssen.realStateApp.services;

import com.sabbirhosssen.realStateApp.model.Subscribe;
import com.sabbirhosssen.realStateApp.repository.SubscribeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscribeService {

    @Autowired
    private SubscribeRepository subscribeRepo;

    public Subscribe addSubcribe(Subscribe subscribe) {
        return subscribeRepo.save(subscribe);
    }
}
