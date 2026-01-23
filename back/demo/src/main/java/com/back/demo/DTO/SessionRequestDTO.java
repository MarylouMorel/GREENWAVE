package com.back.demo.DTO;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class SessionRequestDTO {
    private String titre;
    private String description;
    private LocalDate dateSession;
    private LocalTime heureSession;
    private String adresse;
    private int nombrePlaces;
}
