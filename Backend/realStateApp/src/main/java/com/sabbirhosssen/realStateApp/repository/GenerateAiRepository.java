package com.sabbirhosssen.realStateApp.repository;

import com.sabbirhosssen.realStateApp.model.GenerateAi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenerateAiRepository extends JpaRepository<GenerateAi, Integer> {
}
