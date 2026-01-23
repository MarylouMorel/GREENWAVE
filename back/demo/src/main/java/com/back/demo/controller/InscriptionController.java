package com.back.demo.controller;

import com.back.demo.entity.Inscription;
import com.back.demo.service.InscriptionService;
import com.back.demo.service.UtilisateurService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/inscriptions")
@RequiredArgsConstructor
public class InscriptionController {

    private final InscriptionService inscriptionService;
    private final UtilisateurService utilisateurService; // pour récupérer l'utilisateur courant

    @PostMapping("/demander")
    public ResponseEntity<?> demanderInscription(
            @RequestParam Integer idUtilisateur,
            @RequestParam Integer idSession) {

        try {
            Inscription inscription = inscriptionService.demanderInscription(idUtilisateur, idSession);
            return ResponseEntity.ok("Demande d'inscription envoyée avec succès");
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

}
