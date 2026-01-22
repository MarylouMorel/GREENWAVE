package com.back.demo.entity;

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

    @Column(nullable = false)
    private String statutInscription;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur", nullable = false)
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "id_session", nullable = false)
    private Session session;

    // getters & setters
}
