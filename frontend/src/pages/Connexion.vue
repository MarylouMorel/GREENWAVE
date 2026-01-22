<template>
  <div class="connexion-container">
    <div class="logo-container">
      <img src="../assets/logo.png" alt="GreenWave Logo" class="logo" />
    </div>
    <div class="form-container">
      <h2>Connectez-vous à votre compte</h2>
      <form class="connexion-form" @submit.prevent="handleConnexion">
        <div class="form-group">
          <label>Adresse Email</label>
          <input type="email" placeholder="Adresse Email" v-model="email" />
        </div>
        <div class="form-group">
          <label>Mot de Passe</label>
          <input type="password" placeholder="Mot de Passe" v-model="password" />
        </div>
        <button type="submit" class="btn-connexion">Se Connecter</button>
        <div class="links">
          <a href="#">Mot de passe oublié ?</a>
          <router-link to="/inscription">Pas encore de compte ? S'inscrire</router-link>
        </div>
      </form>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      email: '',
      password: '',
    };
  },
  methods: {
    handleConnexion() {
      // Redirige vers la page d'accueil après le clic sur "Se Connecter"
      this.$router.push('/accueil');
    },
  },
};
</script>

<style scoped>
/* Les styles restent les mêmes que précédemment */
.connexion-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  min-height: 100vh;
  background-color: #f5f5f5;
  padding: 20px;
}
.logo-container {
  margin-bottom: 20px;
}
.logo {
  width: 150px;
}
.form-container {
  background: white;
  padding: 30px;
  border-radius: 8px;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
  width: 100%;
  max-width: 400px;
}
.connexion-form h2 {
  margin-bottom: 20px;
  text-align: center;
}
.form-group {
  margin-bottom: 15px;
}
.form-group label {
  display: block;
  margin-bottom: 5px;
  font-weight: bold;
}
.form-group input {
  width: 100%;
  padding: 10px;
  border: 1px solid #ddd;
  border-radius: 4px;
  font-size: 16px;
}
.btn-connexion {
  width: 100%;
  padding: 10px;
  background-color: #2e8b57;
  color: white;
  border: none;
  border-radius: 4px;
  font-size: 16px;
  cursor: pointer;
}
.btn-connexion:hover {
  background-color: #3cb371;
}
.links {
  margin-top: 15px;
  display: flex;
  justify-content: space-between;
}
.links a {
  color: #2e8b57;
  text-decoration: none;
  font-size: 14px;
}
.links a:hover {
  text-decoration: underline;
}
</style>
