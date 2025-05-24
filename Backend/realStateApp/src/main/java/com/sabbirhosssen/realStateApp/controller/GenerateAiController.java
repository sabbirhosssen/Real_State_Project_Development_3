package com.sabbirhosssen.realStateApp.controller;

import com.sabbirhosssen.realStateApp.model.GenerateAi;
import com.sabbirhosssen.realStateApp.services.GenerateAiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin
@RequestMapping("/ai")
public class GenerateAiController {
    @Autowired
    private GenerateAiService aiService;

    @RequestMapping("/")
    public String  geet(){
        return "hello starting the Notation Real Estate App generate ai";
    }
    @PostMapping("/uploadimage")
    public ResponseEntity<?> addUploadImage(@RequestPart GenerateAi generateAi, @RequestPart MultipartFile imageFile){
        try {
            GenerateAi generateAi1 = aiService.addUploadImage(generateAi, imageFile);
            return new ResponseEntity<>(generateAi1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getloadimage/{generate_id}")
    public ResponseEntity<byte[]> GetGenerateImage (@PathVariable int generate_id) {
        GenerateAi generateAi =aiService.getGenerateImage(generate_id);
        byte[] imageFile   =generateAi.getImageData();
        return  ResponseEntity.ok()
                .contentType(MediaType.valueOf(generateAi.getImageType()))
                .body(imageFile);

    }
}
