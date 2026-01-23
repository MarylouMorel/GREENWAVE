package com.back.demo.service;

import com.back.demo.entity.Session;
import com.back.demo.entity.Utilisateur;
import com.back.demo.repository.SessionRepository;
import com.back.demo.repository.UtilisateurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

@Service
@RequiredArgsConstructor
public class SessionService {

    private final SessionRepository sessionRepository;
    private final UtilisateurRepository utilisateurRepository;

    public Session creerSession(String titre, String description, LocalDate dateSession, LocalTime heureSession,
                                String adresse, int nombrePlaces, int createurId) {

        Utilisateur createur = utilisateurRepository.findById(createurId)
                .orElseThrow(() -> new RuntimeException("Créateur non trouvé avec id : " + createurId));

        Session session = new Session();
        session.setTitre(titre);
        session.setDescription(description);
        session.setDateSession(dateSession);
        session.setHeureSession(heureSession);
        session.setAdresse(adresse);
        session.setNombrePlaces(nombrePlaces);
        session.setStatutSession("PLANIFIEE");
        session.setKgDechetsRamasses(BigDecimal.valueOf(0.0));
        session.setCreateur(createur);

        return sessionRepository.save(session);
    }

    public void supprimerSession(int id) {
        Session session = sessionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Session non trouvée avec id : " + id));
        sessionRepository.delete(session);
    }

}
