package com.sabbirhosssen.realStateApp.repository;

import com.sabbirhosssen.realStateApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
