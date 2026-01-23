package com.back.demo.service;

import com.back.demo.entity.Inscription;
import com.back.demo.entity.Session;
import com.back.demo.entity.Utilisateur;
import com.back.demo.enumeration.StatutInscription;
import com.back.demo.repository.InscriptionRepository;
import com.back.demo.repository.SessionRepository;
import com.back.demo.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class InscriptionService {

    @Autowired
    private InscriptionRepository inscriptionRepository;
    private SessionRepository sessionRepository;
    private UtilisateurRepository utilisateurRepository;

    public Inscription demanderInscription(Integer idUtilisateur, Integer idSession) {
        Utilisateur utilisateur = utilisateurRepository.findById(idUtilisateur)
                .orElseThrow(() -> new RuntimeException("Utilisateur non trouvé"));
        Session session = sessionRepository.findById(idSession)
                .orElseThrow(() -> new RuntimeException("Session non trouvée"));

        // Vérification si l'inscription existe déjà
        boolean existe = inscriptionRepository.existsByUtilisateurAndSession(utilisateur, session);
        if (existe) {
            throw new RuntimeException("Vous êtes déjà inscrit à cette session");
        }

        Inscription inscription = new Inscription();
        inscription.setUtilisateur(utilisateur);
        inscription.setSession(session);
        inscription.setDateInscription(LocalDate.now());
        inscription.setStatutInscription(StatutInscription.EN_ATTENTE);

        return inscriptionRepository.save(inscription);
    }
    public void accepterInscription(Integer idInscription) {
        Inscription insc = inscriptionRepository.findById(idInscription)
                .orElseThrow(() -> new RuntimeException("Inscription non trouvée"));
        insc.setStatutInscription(StatutInscription.ACCEPTEE);
        inscriptionRepository.save(insc);
    }

    public void refuserInscription(Integer idInscription) {
        Inscription insc = inscriptionRepository.findById(idInscription)
                .orElseThrow(() -> new RuntimeException("Inscription non trouvée"));
        insc.setStatutInscription(StatutInscription.REFUSEE);
        inscriptionRepository.save(insc);
    }
}
