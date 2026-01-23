package com.back.demo.repository;


import com.back.demo.entity.Inscription;
import com.back.demo.entity.Session;
import com.back.demo.entity.Utilisateur;
import com.back.demo.enumeration.StatutInscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InscriptionRepository extends JpaRepository<Inscription, Integer> {
    List<Inscription> findBySessionAndStatutInscription(Session session, StatutInscription statut);
    boolean existsByUtilisateurAndSession(Utilisateur utilisateur, Session session);

}
