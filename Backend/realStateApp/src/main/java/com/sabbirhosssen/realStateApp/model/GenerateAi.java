package com.sabbirhosssen.realStateApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenerateAi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Generate_id;
    private String prompt;
    private String ImageName;
    private String ImageType;
    @Lob
    private byte[] ImageData;
}
