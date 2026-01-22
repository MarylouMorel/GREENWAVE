package com.back.demo.repository;


import com.back.demo.entity.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InscriptionRepository extends JpaRepository<Inscription, Integer> {

    long countBySessionIdSessionAndStatutInscription(Integer idSession, String statutInscription);

    boolean existsByUtilisateurIdUtilisateurAndSessionIdSession(Integer idUtilisateur, Integer idSession);
}
