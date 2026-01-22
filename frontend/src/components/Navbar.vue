<template>
  <nav class="navbar">
    <div class="logo">
      <img src="../assets/logo.png"  alt="GreenWave Logo" />
    </div>
    <ul class="nav-links">
      <li><router-link to="/">Accueil</router-link></li>
      <li><router-link to="/sessions">Mes Sessions</router-link></li>
      <li><router-link to="/historique">Communauté</router-link></li>
      <li><router-link to="/connexion">Déconnexion</router-link></li>
    </ul>
  </nav>
</template>

<script>
export default {
  methods: {
    handleDeconnexion() {
      // Redirige vers la page de connexion après la déconnexion
      this.$router.push('/connexion');
    },
  },
};
</script>

<style scoped>
.navbar {
  display: flex;
  justify-content: space-between;
  align-items: center;
  padding: 1rem;
  background-color: white;
  border-bottom: 1px solid #ddd;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.logo img {
  width: 100px;  /* Largeur fixe */
  height: auto; /* Hauteur ajustée automatiquement */
  object-fit: contain; /* Force l'image à s'adapter aux dimensions */
}

.nav-links {
  display: flex;
  gap: 1.5rem;
  list-style: none;
  align-items: center;
}

.nav-links a {
  text-decoration: none;
  color: #2c3e50;
  font-weight: 500;
}

.nav-links a:hover {
  color: #42b983;
}
</style>>
