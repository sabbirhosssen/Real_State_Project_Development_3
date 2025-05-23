package com.sabbirhosssen.realStateApp.repository;

import com.sabbirhosssen.realStateApp.model.Subscribe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscribeRepository extends JpaRepository<Subscribe, Integer> {
}
