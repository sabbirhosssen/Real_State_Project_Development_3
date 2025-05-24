package com.sabbirhosssen.realStateApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Subscribe {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int SubscribeId;
    private String SubscribeEmail;

}
