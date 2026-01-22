<script setup>
const fetchData = async () => {
  try {
    const response = await fetch('/api/test'); // Utilise le proxy
    const data = await response.json();
    console.log('Données reçues :', data);
    alert('Connexion réussie ! Données : ' + JSON.stringify(data));
  } catch (error) {
    console.error('Erreur :', error);
    alert('Erreur lors de la connexion au backend.');
  }
};
</script>

<template>
  <button @click="fetchData">Tester la connexion au backend</button>
</template>
