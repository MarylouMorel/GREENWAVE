package com.back.demo.service;

import com.back.demo.entity.Inscription;
import com.back.demo.enumeration.StatutInscription;
import com.back.demo.repository.InscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscriptionService {

    @Autowired
    private InscriptionRepository inscriptionRepository;

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
