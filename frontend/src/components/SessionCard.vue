<template>
  <div class="session-card">
    <h3>{{ session.title }}</h3>
    <p>{{ session.date }}</p>
    <p>{{ session.location }}</p>
    <p>👥 Inscriptions: {{ session.inscriptions }}</p>
    <div class="actions">
      <button class="btn-modify">Modifier</button>
      <button class="btn-cancel">Annuler</button>
    </div>
  </div>
</template>

<script>
export default {
  props: {
    session: {
      type: Object,
      required: true,
    },
  },
};
</script>

<style scoped>
.session-card {
  border: 1px solid #ddd;
  border-radius: 4px;
  padding: 1rem;
}
.actions {
  display: flex;
  gap: 0.5rem;
  margin-top: 1rem;
}
.btn-modify {
  background-color: #ffc107;
  color: white;
  border: none;
  padding: 0.5rem 1rem;
  border-radius: 4px;
}
.btn-cancel {
  background-color: #dc3545;
  color: white;
  border: none;
  padding: 0.5rem 1rem;
  border-radius: 4px;
}
</style>
