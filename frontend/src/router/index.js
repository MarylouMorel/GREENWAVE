import { createRouter, createWebHistory } from 'vue-router';
import Connexion from '../pages/Connexion.vue';
import Inscription from '../pages/Inscription.vue';
import Accueil from '../pages/Accueil.vue';

const routes = [
  { path: '/', redirect: '/connexion' },
  { path: '/connexion', component: Connexion },
  { path: '/inscription', component: Inscription },
  { path: '/accueil', component: Accueil },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
