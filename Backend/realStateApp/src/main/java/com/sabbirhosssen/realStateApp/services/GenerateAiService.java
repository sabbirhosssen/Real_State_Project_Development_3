package com.sabbirhosssen.realStateApp.services;

import com.sabbirhosssen.realStateApp.controller.GenerateAiController;
import com.sabbirhosssen.realStateApp.model.GenerateAi;
import com.sabbirhosssen.realStateApp.repository.GenerateAiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class GenerateAiService {
    @Autowired
    private GenerateAiRepository generateRepo;

    public GenerateAi addUploadImage(GenerateAi generateAi, MultipartFile imageFile) throws IOException {
        generateAi.setImageName(imageFile.getOriginalFilename());
        generateAi.setImageType(imageFile.getContentType());
        generateAi.setImageData(imageFile.getBytes());
        return generateRepo.save(generateAi);
    }

    public GenerateAi getGenerateImage(int generateId) {
        return generateRepo.findById(generateId).orElse(null);
    }
}
