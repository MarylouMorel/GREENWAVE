package com.back.demo.repository;

import com.back.demo.entity.UtilisateurBadge;
import com.back.demo.entity.cleComposite.UtilisateurBadgeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurBadgeRepository
        extends JpaRepository<UtilisateurBadge, UtilisateurBadgeId> {
}
