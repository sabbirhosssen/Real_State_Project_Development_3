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
public class Contact {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int productId;
    private String contactName;
    private String contactEmail;
    private String contactPhone;
    private String contactAddress;
    private String contactMessage;
    private String password;

}
