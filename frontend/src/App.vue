<script setup>
import Hello from './components/Hello.vue';
</script>

<template>
  <div>
    <h1>Bienvenue sur mon application Vue.js !</h1>
    <p>
      Ce projet est connecté à un backend Spring Boot via un proxy.
    </p>
    <!-- Intègre le composant Hello.vue -->
    <Hello />
  </div>
</template>

<style scoped>
h1 {
  color: #42b983;
}
</style>
