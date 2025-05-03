
# 🎬 Filmotheque - Application de Gestion de Films et Acteurs

Application Spring Boot de gestion de films, catégories et acteurs avec API REST documentée par Swagger.

## 🚀 Fonctionnalités
- **CRUD complet** pour Films, Catégories et Acteurs
- **Relation ManyToMany** entre Films et Acteurs
- **API REST** avec documentation Swagger
- Interface Web Thymeleaf
- Gestion des :
  - Films (titre, description, année, catégorie)
  - Catégories (nom)
  - Acteurs (nom, prénom)
- Recherche/filtrage par :
  - Titre de film
  - Catégorie
  - Acteurs

## 🛠 Technologies
- **Backend** : 
  ![Java](https://img.shields.io/badge/Java-17-red)
  ![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1-green)
  ![Hibernate](https://img.shields.io/badge/Hibernate-6.1-blue)
- **Frontend** : 
  ![Thymeleaf](https://img.shields.io/badge/Thymeleaf-3.1-orange)
- **Base de Données** : 
  ![H2](https://img.shields.io/badge/H2-Database-brightgreen)
- **Outils** : 
  ![Swagger](https://img.shields.io/badge/Swagger-3.0-lightgreen)
  ![Lombok](https://img.shields.io/badge/Lombok-1.18-pink)
  ![Maven](https://img.shields.io/badge/Maven-4.0-blueviolet)

## ⚙️ Installation
1. Cloner le dépôt :
```bash
git clone https://github.com/votre-utilisateur/filmotheque.git
```
2. Lancer l'application :
```bash
mvn spring-boot:run
```

## 📚 Documentation API
Accédez à Swagger UI après le démarrage :
```
http://localhost:8080/swagger-ui.html
```

Exemple de endpoints :
- `GET /api/films` - Liste tous les films
- `POST /api/acteurs` - Crée un nouvel acteur
- `GET /api/categories/1/films` - Films par catégorie

## 🌟 Fonctionnalités Avancées
- Gestion des relations ManyToMany
- Validation des entrées
- Réponses HTTP personnalisées
- Configuration H2 avec interface console :
```
http://localhost:8080/h2-console
```

## 📝 License
[MIT License](LICENSE)

---

✅ **Tips** :
- Personnalisez les badges avec [shields.io](https://shields.io)
- Ajoutez des captures d'écran de Swagger et de l'interface
- Incluez un diagramme UML des entités
- Ajoutez un exemple de fichier `data.sql` pour les données de test
![Capture d'écran 2025-04-29 162715](https://github.com/user-attachments/assets/d98662e7-f61c-4ce5-8e05-af164588cc46)
![Capture d'écran 2025-04-29 165557]![Capture d'écran 2025-04-22 114645](https://github.com/user-attachments/assets/b2a5909b-8fbe-485b-805e-c34a685b77d0)
![Capture d'écran 2025-04-22 114832](https://github.com/user-attachments/assets/4fed95cb-3364-4766-b2ff-9fd8f06719a1)
![addfilm1](https://github.com/user-attachments/assets/056d4137-e145-4334-b320-0d240ab9d25e)
![resaddfil1](https://github.com/user-attachments/assets/735ed497-9614-43f1-b59e-249dc2698811)
![Capture d'écran 2025-04-22 113213](https://github.com/user-attachments/assets/4b1370c7-6f1c-468b-ae40-d4d414dc1560)
![Capture d'écran 2025-04-22 113403](https://github.com/user-attachments/assets/f76a7ffd-59cd-4abd-9bf4-f8b25245c1e9)
![Capture d'écran 2025-04-22 113707](https://github.com/user-attachments/assets/3fc7b8e2-7127-40f4-8833-8c905b8c56f6)
![Capture d'écran 2025-04-22 114241](https://github.com/user-attachments/assets/948f9793-73de-4bb0-b470-2ba3d8ce7ad8)
![Capture d'écran 2025-04-22 114346](https://github.com/user-attachments/assets/a4cc67c2-a822-4e5f-a1d4-117dc2f0ba84)
![Capture d'écran 2025-04-22 114432](https://github.com/user-attachments/assets/f26fb2d6-64a9-4b77-8386-b73ea239eaab)
(https://github.com/user-attachments/assets/b7eea2cc-4fef-4129-89bc-5838c2eca29e)
![Capture d'écran 2025-04-29 165710](https://github.com/user-attachments/assets/a274f113-309a-4a81-9071-58ab7a86f2c1)
![Capture d'écran 2025-04-29 160026](https://github.com/user-attachments/assets/6456072c-3a01-4896-9ecb-efd555a5f72c)
![Capture d'écran 2025-04-29 160126](https://github.com/user-attachments/assets/2af1095e-f516-41c6-8398-dc1474d2a2e3)
