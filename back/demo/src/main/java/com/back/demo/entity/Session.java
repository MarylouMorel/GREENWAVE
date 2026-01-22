package com.back.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "session")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_session")
    private Integer id;

    @Column(name = "titre", nullable = false, length = 150)
    private String titre;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "date_session", nullable = false)
    private LocalDate dateSession;

    @Column(name = "heure_session", nullable = false)
    private LocalTime heureSession;

    @Column(name = "adresse", nullable = false, length = 255)
    private String adresse;

    @Column(name = "nombre_places", nullable = false)
    private Integer nombrePlaces;

    @Column(name = "statut_session", nullable = false, length = 30)
    private String statutSession;

    @Column(name = "kg_dechets_ramasses", nullable = true)
    private BigDecimal kgDechetsRamasses = BigDecimal.valueOf(0.0);

    @ManyToOne
    @JoinColumn(name = "id_createur", nullable = false)
    private Utilisateur createur;

    @ManyToMany
    @JoinTable(
            name = "session_recompense",
            joinColumns = @JoinColumn(name = "id_session"),
            inverseJoinColumns = @JoinColumn(name = "id_recompense")
    )
    private Set<Recompense> recompenses = new HashSet<>();

}
