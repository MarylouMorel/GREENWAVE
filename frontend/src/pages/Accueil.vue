<template>
  <div class="accueil-container">
    <Navbar />


    <section
      class="hero"
      :style="{ backgroundImage: `url(${imageOcean})` }"
    >
      <div class="hero-overlay">
        <h1>Bonjour !</h1>
        <p>Trouvez et rejoignez une session de ramassage de déchets</p>
        <button class="hero-btn">Découvrir les Sessions</button>
      </div>
    </section>


    <div class="content">
      <!-- SESSIONS -->
      <section class="sessions">
        <div class="section-header">
          <h2>Sessions de Ramassage à Venir</h2>
          <a href="#" class="link">Voir Toutes les Sessions ></a>
        </div>

        <div class="session-card">
          <img
            src="../assets/image_ocean.png"
            alt="Session"
            class="session-image"
          />
          <div class="session-info">
            <h3>Ramassage Plage de Nice</h3>
            <p class="date">25 Juin 10h00</p>
            <p class="location">Nice, Promenade des Anglais</p>
            <p class="places">🟢 10 places restantes</p>
            <button class="session-btn">S'inscrire</button>
          </div>
        </div>
      </section>

      <!-- MON SUIVI -->
      <section class="suivi">
        <h2>Mon Suivi</h2>

        <div class="stats">
          <div class="stat-card">
            <h3>15</h3>
            <p>Sessions</p>
            <span>Actions écologiques</span>
          </div>

          <div class="stat-card">
            <h3>5</h3>
            <p>Badges</p>
            <span>Récompenses</span>
          </div>

          <div class="stat-card large">
            <h3>580 kg</h3>
            <p>de déchets ramassés</p>
          </div>
        </div>
      </section>
    </div>
  </div>
</template>

<script>
import Navbar from "../components/Navbar.vue";
import imageOcean from "../assets/image_ocean.png";

export default {
  components: { Navbar },
  data() {
    return {
      imageOcean,
    };
  },
};
</script>

<style scoped>
.accueil-container {
  background-color: #f4f6f8;
  min-height: 100vh;
}

/* HERO */
.hero {
  height: 320px;
  background-size: cover;
  background-position: center;
  position: relative;
}

.hero-overlay {
  background: rgba(0, 0, 0, 0.45);
  height: 100%;
  color: white;
  display: flex;
  flex-direction: column;
  justify-content: center;
  padding: 2rem 4rem;
}

.hero h1 {
  font-size: 32px;
  margin-bottom: 10px;
}

.hero p {
  font-size: 16px;
  margin-bottom: 20px;
}

.hero-btn {
  width: fit-content;
  padding: 10px 18px;
  background-color: #2e8b57;
  border: none;
  color: white;
  border-radius: 4px;
  cursor: pointer;
}

/* CONTENT */
.content {
  display: flex;
  gap: 2rem;
  padding: 2rem 4rem;
}

/* SESSIONS */
.sessions {
  flex: 2;
}

.section-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.link {
  color: #2e8b57;
  text-decoration: none;
  font-size: 14px;
}

.session-card {
  display: flex;
  background: white;
  border-radius: 8px;
  margin-top: 1rem;
  overflow: hidden;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.08);
}

.session-image {
  width: 180px;
  object-fit: cover;
}

.session-info {
  padding: 1rem;
  flex: 1;
}

.session-info h3 {
  margin-bottom: 6px;
}

.date,
.location,
.places {
  font-size: 14px;
  margin-bottom: 4px;
}

.session-btn {
  margin-top: 10px;
  padding: 8px 14px;
  background-color: #2e8b57;
  color: white;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

/* SUIVI */
.suivi {
  flex: 1;
}

.stats {
  display: grid;
  grid-template-columns: repeat(2, 1fr);
  gap: 1rem;
  margin-top: 1rem;
}

.stat-card {
  background: white;
  border-radius: 8px;
  padding: 1rem;
  text-align: center;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.08);
}

.stat-card h3 {
  font-size: 28px;
  color: #2e8b57;
}

.stat-card span {
  font-size: 12px;
  color: #888;
}

.stat-card.large {
  grid-column: span 2;
}
</style>
