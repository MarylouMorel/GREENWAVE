package com.back.demo.service;


import com.back.demo.entity.Role;
import com.back.demo.entity.Utilisateur;
import com.back.demo.repository.RoleRepository;
import com.back.demo.repository.UtilisateurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@RequiredArgsConstructor
@Service
public class UtilisateurService {

    @Autowired
    private UtilisateurRepository utilisateurRepository;

    @Autowired
    private RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;


    public Utilisateur creerUtilisateur(String nom, String prenom, String email, String motDePasse, String libelleRole) {
        // Récupération du rôle
        Role role = roleRepository.findByLibelleRole(libelleRole)
                .orElseThrow(() -> new RuntimeException("Rôle non trouvé : " + libelleRole));

        String hashedPassword = passwordEncoder.encode(motDePasse);

        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(nom);
        utilisateur.setPrenom(prenom);
        utilisateur.setEmail(email);
        utilisateur.setMotDePasse(hashedPassword); //mdp hashé
        utilisateur.setDateInscription(LocalDate.now());
        utilisateur.setStatutCompte("ACTIF");
        utilisateur.setCompteurPoints(0);
        utilisateur.setRole(role);


        return utilisateurRepository.save(utilisateur);
    }
}
