package com.back.demo.entity;

import com.back.demo.enumeration.StatutInscription;
import com.fasterxml.jackson.annotation.JsonGetter;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(
        name = "inscription",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"id_utilisateur", "id_session"})
        }
)
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInscription;

    @Column(nullable = false)
    private LocalDate dateInscription;

    @Column(name = "statut_inscription", nullable = false)
    @Enumerated(EnumType.STRING)
    private StatutInscription statutInscription;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur", nullable = false)
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "id_session", nullable = false)
    private Session session;

    // getters & setters
}
