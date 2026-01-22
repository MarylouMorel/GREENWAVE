<template>
  <div class="accueil-container">
    <Navbar />
    <div class="hero">
      <h1>Bienvenue sur GreenWave, Richard !</h1>
      <p>Gérez vos sessions de ramassage de déchets.</p>
    </div>
    <div class="sessions">
      <h2>Mes Sessions de Ramassage</h2>
      <div class="sessions-list">
        <SessionCard
          v-for="session in sessions"
          :key="session.id"
          :session="session"
        />
      </div>
    </div>
  </div>
</template>

<script>
import Navbar from '../components/Navbar.vue';
import SessionCard from '../components/SessionCard.vue';

export default {
  components: { Navbar, SessionCard },
  data() {
    return {
      sessions: [
        {
          id: 1,
          title: "Ramassage Plage de Nice",
          date: "25 Juin 10h00",
          location: "Nice, Promenade des Anglais",
          inscriptions: 20,
        },
        {
          id: 2,
          title: "Ramassage Forêt de Lyon",
          date: "25 Juin 10h00",
          location: "Nice, Promenade des Anglais",
          inscriptions: 20,
        },
      ],
    };
  },
};
</script>

<style scoped>
.accueil-container {
  min-height: 100vh;
  background-color: #f5f5f5;
}
.hero {
  text-align: center;
  padding: 2rem;
  background-color: #f0f8ff;
}
.sessions {
  padding: 2rem;
}
.sessions-list {
  display: flex;
  flex-direction: column;
  gap: 1rem;
}
</style>
