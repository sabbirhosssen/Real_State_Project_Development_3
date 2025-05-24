package com.sabbirhosssen.realStateApp.services;

import com.sabbirhosssen.realStateApp.model.Subscribe;
import com.sabbirhosssen.realStateApp.repository.SubscribeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscribeService {

    @Autowired
    private SubscribeRepository subscribeRepo;

    public Subscribe addSubscribe(Subscribe subscribe) {
        return subscribeRepo.save(subscribe);
    }

    public List<Subscribe> getAllSubscribe() {
        return subscribeRepo.findAll();
    }
}
