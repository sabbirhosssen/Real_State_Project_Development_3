package com.sabbirhosssen.realStateApp.services;

import com.sabbirhosssen.realStateApp.model.Product;
import com.sabbirhosssen.realStateApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductServices {
    @Autowired
    private  ProductRepository repo;

    public List<Product> getAllProducts(){
        return repo.findAll();
    }

    public Product getProductById(int productId){
        return repo.findById(productId).orElse( new Product());
    }


     public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
         product.setImageName(imageFile.getOriginalFilename());
         product.setImageType(imageFile.getContentType());
         product.setImageData(imageFile.getBytes());
         return repo.save(product);

    }
    public Product getProduct(int id) {
        return repo.findById(id).orElse(null);
    }
    public Product updateProduct(Product product){
        return repo.save(product);
    }
    public void deleteProduct(int productId){
        repo.deleteById(productId);
    }


}
