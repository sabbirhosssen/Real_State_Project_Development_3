package com.sabbirhosssen.realStateApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int productId;
    private String productName;
    private String productDesc;
    private String productLocation;
    private String productArea;
    private String productRoom;
    private String productGarages;
    private String productBathrooms;
    private Date releaseDate;
    private boolean productAvailable;

    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;

}
