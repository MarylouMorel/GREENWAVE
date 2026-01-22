package com.back.demo.entity.cleComposite;


import java.io.Serializable;
import java.util.Objects;

public class UtilisateurBadgeId implements Serializable {

    private Integer utilisateur;
    private Integer badge;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UtilisateurBadgeId)) return false;
        UtilisateurBadgeId that = (UtilisateurBadgeId) o;
        return Objects.equals(utilisateur, that.utilisateur)
                && Objects.equals(badge, that.badge);
    }

    @Override
    public int hashCode() {
        return Objects.hash(utilisateur, badge);
    }
}
