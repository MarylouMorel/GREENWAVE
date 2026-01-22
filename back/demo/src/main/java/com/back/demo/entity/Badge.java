package com.back.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "badge")
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBadge;

    @Column(nullable = false, unique = true)
    private String nom;

    @Column
    private String description;

    @Column
    private int nombreSessionsValides;
}
