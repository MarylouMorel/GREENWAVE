<template>
  <div>
    <Navbar />
    <h2>Mes Sessions de Ramassage</h2>
    <div class="sessions-list">
      <SessionCard
        v-for="session in sessions"
        :key="session.id"
        :session="session"
      />
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
.sessions-list {
  display: flex;
  flex-direction: column;
  gap: 1rem;
  padding: 1rem;
}
</style>
