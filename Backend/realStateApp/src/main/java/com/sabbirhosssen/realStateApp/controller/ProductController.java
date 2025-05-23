package com.sabbirhosssen.realStateApp.controller;

import com.sabbirhosssen.realStateApp.model.Product;
import com.sabbirhosssen.realStateApp.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.awt.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {
    @Autowired
    private ProductServices services;

    @RequestMapping("/")
    public String  geet(){
        return "hello starting the Notation Real Estate App";

    }
    @GetMapping("/products")
        public List<Product> getAllProducts(){
        return services.getAllProducts();
    }
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {
        Product product = services.getProduct(id);
        if (product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile) {
        try {
            Product product1 = services.addProduct(product, imageFile);
            return new ResponseEntity<>(product1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]> GetImageByProductId (@PathVariable int productId) {
        Product product = services.getProduct(productId);
        byte[] imageFile   =product.getImageData();

        return  ResponseEntity.ok()
                .contentType(MediaType.valueOf(product.getImageType()))
                .body(imageFile);

    }


    @PutMapping("/product")
    public Product updateProduct(@RequestBody Product product){
        return services.updateProduct(product);
    }
    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable int id){
        services.deleteProduct(id);

    }

}
