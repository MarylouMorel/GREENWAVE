<template>
  <div class="inscription-container">
    <div class="logo-container">
      <img src="../assets/logo.png" alt="GreenWave Logo" class="logo" />
    </div>
    <div class="form-container">
      <h2>Inscrivez-vous et rejoignez la communauté Greenwave</h2>
      <form class="inscription-form" @submit.prevent="handleInscription">
        <div class="form-group">
          <label>Nom</label>
          <input type="text" placeholder="Nom" v-model="nomPrenom" />
        </div>
        <div class="form-group">
          <label>Prénom</label>
          <input type="text" placeholder="Prénom" v-model="nomPrenom" />
        </div>
        <div class="form-group">
          <label>Adresse Email</label>
          <input type="email" placeholder="Adresse Email" v-model="email" />
        </div>
        <div class="form-group">
          <label>Mot de Passe</label>
          <input type="password" placeholder="Mot de Passe" v-model="password" />
        </div>
        <div class="form-group">
          <label>Confirmer le Mot de Passe</label>
          <input type="password" placeholder="Confirmer le Mot de Passe" v-model="confirmPassword" />
        </div>
        <button type="submit" class="btn-inscription">S'inscrire</button>
        <div class="links">
          <p>Déjà un compte ? <router-link to="/connexion">Se connecter</router-link></p>
        </div>
      </form>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      nomPrenom: '',
      email: '',
      password: '',
      confirmPassword: '',
    };
  },
  methods: {
    handleInscription() {
      // Redirige vers la page d'accueil après le clic sur "S'inscrire"
      this.$router.push('/accueil');
    },
  },
};
</script>

<style scoped>
/* Les styles restent les mêmes que précédemment */
.inscription-container {
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
.inscription-form h2 {
  margin-bottom: 20px;
  text-align: center;
  font-size: 18px;
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
.btn-inscription {
  width: 100%;
  padding: 10px;
  background-color: #2e8b57;
  color: white;
  border: none;
  border-radius: 4px;
  font-size: 16px;
  cursor: pointer;
}
.btn-inscription:hover {
  background-color: #3cb371;
}
.links {
  margin-top: 15px;
  text-align: center;
}
.links a {
  color: #2e8b57;
  text-decoration: none;
}
.links a:hover {
  text-decoration: underline;
}
</style>
