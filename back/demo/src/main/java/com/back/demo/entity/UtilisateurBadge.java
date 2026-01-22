package com.back.demo.entity;

import com.back.demo.entity.cleComposite.UtilisateurBadgeId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "utilisateur_badge")
@IdClass(UtilisateurBadgeId.class)
public class UtilisateurBadge {

    @Id
    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private Utilisateur utilisateur;

    @Id
    @ManyToOne
    @JoinColumn(name = "id_badge")
    private Badge badge;

    @Column(nullable = false)
    private LocalDate dateObtention;

}
