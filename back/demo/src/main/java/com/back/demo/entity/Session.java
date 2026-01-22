package com.back.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "session")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSession;

    @Column(nullable = false)
    private String titre;

    @Column
    private String description;

    @Column(nullable = false)
    private LocalDate dateSession;

    @Column(nullable = false)
    private LocalTime heureSession;

    @Column(nullable = false)
    private String adresse;

    @Column(nullable = false)
    private Integer nombrePlaces;

    @Column(nullable = false)
    private String statutSession;

    @ManyToOne
    @JoinColumn(name = "id_createur", nullable = false)
    private Utilisateur createur;

    @OneToMany(mappedBy = "session")
    private List<Inscription> inscriptions;

    // getters & setters
}
