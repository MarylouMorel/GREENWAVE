# Projet [Nom de votre projet]

Application web full-stack avec Spring Boot (Backend), Vue.js (Frontend) et MySQL (Base de données).

---

## 📋 Prérequis

Avant de commencer, vous devez avoir installé sur votre machine :

### Obligatoire
- **Java JDK 17+** → [Télécharger ici](https://www.oracle.com/java/technologies/downloads/)
- **Maven 3.8+** → [Télécharger ici](https://maven.apache.org/download.cgi) (ou vérifier avec `mvn -v`)
- **Node.js 18+ et npm** → [Télécharger ici](https://nodejs.org/)
- **MySQL 8.0+** → [Télécharger ici](https://dev.mysql.com/downloads/installer/)

### Vérification des installations

Ouvrez un terminal et exécutez :

```bash
java -version    # Doit afficher Java 17+
mvn -v           # Doit afficher Maven 3.8+
node -v          # Doit afficher v18+
npm -v           # Doit afficher 9+
mysql --version  # Doit afficher MySQL 8.0+
```

---

## 🚀 Installation et Démarrage

### 1️⃣ Cloner le projet

```bash
git clone https://github.com/votre-username/votre-repo.git
cd votre-repo
```

---

### 2️⃣ Configuration de la Base de Données

#### Étape A : Démarrer MySQL

**Windows :**
- Ouvrez "Services" → Démarrez "MySQL80"
- Ou via MySQL Workbench

**Mac/Linux :**
```bash
sudo service mysql start
# ou
brew services start mysql
```

#### Étape B : Créer la base de données

**Option 1 - Via ligne de commande :**
```bash
mysql -u root -p
```
Puis dans MySQL :
```sql
CREATE DATABASE nom_de_votre_bdd;
USE nom_de_votre_bdd;
SOURCE database/init.sql;
EXIT;
```

**Option 2 - Via MySQL Workbench :**
1. Ouvrir MySQL Workbench
2. Se connecter à votre serveur local
3. File → Open SQL Script → Sélectionner `database/init.sql`
4. Exécuter le script (icône éclair ⚡)

#### Étape C : Configurer les identifiants

Ouvrez le fichier : `backend/src/main/resources/application.properties`

Modifiez ces lignes selon votre configuration MySQL :

```properties
spring.datasource.username=root
spring.datasource.password=VOTRE_MOT_DE_PASSE_MYSQL
```

---

### 3️⃣ Lancer le Backend (Spring Boot)

Ouvrez un **premier terminal** :

```bash
cd backend
mvn clean install
mvn spring-boot:run
```

✅ **Le backend est prêt quand vous voyez :**
```
Tomcat started on port(s): 8080
```

🌐 **API accessible sur :** http://localhost:8080

---

### 4️⃣ Lancer le Frontend (Vue.js)

Ouvrez un **deuxième terminal** (gardez le backend actif) :

```bash
cd frontend
npm install
npm run dev
```

✅ **Le frontend est prêt quand vous voyez :**
```
VITE v5.x.x  ready in xxx ms
➜  Local:   http://localhost:5173/
```

🌐 **Application accessible sur :** http://localhost:5173

---

## 🎯 Accéder à l'Application

1. Assurez-vous que MySQL, le backend et le frontend sont démarrés
2. Ouvrez votre navigateur
3. Allez sur : **http://localhost:5173**

---

## 🛑 Arrêter l'Application

Dans chaque terminal :
- Appuyez sur `Ctrl + C`

Pour arrêter MySQL :
- **Windows :** Services → Arrêter MySQL80
- **Mac/Linux :** `sudo service mysql stop` ou `brew services stop mysql`

---

## ⚙️ Structure du Projet

```
votre-repo/
├── backend/                    # Application Spring Boot
│   ├── src/
│   ├── pom.xml
│   └── application.properties
├── frontend/                   # Application Vue.js
│   ├── src/
│   ├── package.json
│   └── vite.config.js
├── database/                   # Scripts SQL
│   └── init.sql
└── README.md
```

---

## 🐛 Résolution des Problèmes Courants

### ❌ Port 8080 déjà utilisé (Backend)

**Erreur :** `Port 8080 is already in use`

**Solution :**
Dans `backend/src/main/resources/application.properties`, changez :
```properties
server.port=8081
```

### ❌ Port 5173 déjà utilisé (Frontend)

**Solution :**
Dans `frontend/vite.config.js`, ajoutez :
```javascript
export default defineConfig({
  server: {
    port: 3000
  }
})
```

### ❌ Erreur de connexion à MySQL

**Erreur :** `Access denied for user 'root'@'localhost'`

**Vérifications :**
1. MySQL est bien démarré
2. Le mot de passe dans `application.properties` est correct
3. La base de données existe : `SHOW DATABASES;` dans MySQL

### ❌ CORS Error dans le navigateur

**Erreur :** `Access to XMLHttpRequest blocked by CORS policy`

**Solution :**
Vérifiez dans `application.properties` :
```properties
spring.web.cors.allowed-origins=http://localhost:5173
```

### ❌ npm install échoue

**Solution :**
```bash
cd frontend
rm -rf node_modules package-lock.json
npm cache clean --force
npm install
```

---

## 📚 Technologies Utilisées

- **Backend :** Spring Boot 3.x, Java 17
- **Frontend :** Vue.js 3, Vite
- **Base de données :** MySQL 8.0
- **Build :** Maven, npm

---

## 👤 Auteur

**[Votre Nom]**
- Email : votre.email@example.com
- GitHub : [@votre-username](https://github.com/votre-username)

---

## 📝 Notes pour l'Évaluation

- Tous les endpoints API sont documentés dans `backend/README.md`
- Les composants Vue.js sont dans `frontend/src/components/`
- Le schéma de base de données est dans `database/schema.png` (si vous en avez un)

---

## ⚖️ Licence

Ce projet est réalisé dans le cadre d'un projet académique.