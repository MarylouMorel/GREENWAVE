package com.back.demo.controller;

import com.back.demo.DTO.UtilisateurDTO;
import com.back.demo.DTO.LoginDTO;

import com.back.demo.entity.Utilisateur;
import com.back.demo.entity.Role;
import com.back.demo.repository.UtilisateurRepository;
import com.back.demo.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Optional;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/utilisateurs")
@RequiredArgsConstructor
public class UtilisateurController {

    private final UtilisateurRepository utilisateurRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;



    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UtilisateurDTO dto) {
        if(utilisateurRepository.findByEmail(dto.email).isPresent()) {
            return ResponseEntity.badRequest().body("Email déjà utilisé");
        }

        Role role = roleRepository.findByLibelleRole("utilisateur")
                .orElseThrow(() -> new RuntimeException("Rôle par défaut non trouvé"));


        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setNom(dto.nom);
        utilisateur.setPrenom(dto.prenom);
        utilisateur.setEmail(dto.email);
        utilisateur.setMotDePasse(dto.motDePasse);
        utilisateur.setDateInscription(LocalDate.now());
        utilisateur.setStatutCompte("ACTIF");
        utilisateur.setCompteurPoints(0);
        utilisateur.setRole(role);

        Utilisateur savedUser = utilisateurRepository.save(utilisateur);

        return ResponseEntity.ok(savedUser);
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO dto) {
        Optional<Utilisateur> optUser = utilisateurRepository.findByEmail(dto.email);
        if(optUser.isEmpty()) {
            return ResponseEntity.status(401).body("Email ou mot de passe incorrect");
        }

        Utilisateur utilisateur = optUser.get();

        if(!Objects.equals(dto.motDePasse, utilisateur.getMotDePasse())){
            return ResponseEntity.status(401).body("Email ou mot de passe incorrect");
        }

        return ResponseEntity.ok("Connexion réussie pour " + utilisateur.getNom() + " " + utilisateur.getPrenom());
    }
}
