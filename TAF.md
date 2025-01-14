# ANALYSE DES BESOINS DU CLIENT

## Besoin:
    Application de prise de rendez-vous des patients

## Fonctionalités:

    - Prendre un rendez-vous
    - Annuler un rendez-vous
    - Modifier un rendez-vous 
    - Consulter les rendez-vous diponibles (Affiche un la liste)
    - Consulter l'historique des rendez-vous passés (Affiche un la liste)
    - Consulter les rendez-vous à venir (Affiche un la liste)
    - Terminer un rendez-vous (Marque un rendez-vous comme terminé)
    - Gestion des médecins
        * Ajouter un médécin
        * Modifier un médécin
        * Supprimer un médécin
    - Gesion de disponibilités des médécin
        * Ajouter un crénau horaire de disponibilité pour un médécin
        * Modifier un crénau horaire de disponibilité pour un médécin
        * Supprimer un crénau horaire de disponibilité pour un médécin
    - Notifications de Rappels

## Actionnaires:

    - Patient
    - Médécin
    - Sécrétaire

## Cas D'Utilisation:

    * Patient
        - Prendre un rendez-vous
        - Annuler un rendez-vous
        - Modifier un rendez-vous
        - Consulter les rendez-vous diponibles
        - Consulter l'historique des rendez-vous passés
        - Consulter les rendez-vous à venir
    * Médécin
        - Consulter les rendez-vous programmés
        - Consulter l'historique des rendez-vous passés
        - Consulter les rendez-vous à venir
        - Terminer un rendez-vous
    * Sécrétaire (Administrateur)
        - Consulter les rendez-vous programmés
        - Consulter l'historique des rendez-vous passés
        - Consulter les rendez-vous à venir
        - Ajouter un médécin
        - Modifier un médécin
        - Supprimer un médécin
        - Ajouter un crénau horaire de disponibilité pour un médécin
        - Modifier un crénau horaire de disponibilité pour un médécin
        - Supprimer un crénau horaire de disponibilité pour un médécin

## Séquence D'Utilisation:

    * Prendre un rendez-vous:
        1- Le patient choisit d'abord une spécialité médicale (exemple : ophtalmologie, cardiologie,...)
        2- il accède à la liste des médecins disponibles dans cette spécialité.
        3- Le patient choisit un médecin, puis il sélectionne une date et un créneau horaire libre parmi les créneaux proposés.

## Entités

    Patient [
        - nom (String)
        - prenom (String)
        - role (String)
        - email (String)
        - password (String)
        - taille (Double)
        - poids (Double)
        - age (Int)
    ]

    Médécin [
        - {Patient}
        - _spécialités (List de Spécialités)
        - _créneaux (List des Crébeaux de disponibilité du Médécin)
    ]

    Sécrétaire [
        - {Patient}
    ]

    Spécilité [
        - nom (String)
    ]

    Créneau [
        - heure de debut (Time)
        - heure de fin (Time)
        - _médécin (List de Médécins ce créneau)
    ]

    RendezVous [
        - date (Date)
        - etat (String)
        - _créneau (List composé de Heure de début et Heure de fin)
        - _patient (Patient.id)
        - _médécin (Médécin.id)
    ]


## Organisation MVC

    src/
    ├── controller/
    │   ├── SecretaireController.java
    │   ├── MedecinController.java
    │   ├── RendezVousController.java
    ├── model/
    │   ├── entities/
    │   │   ├── Creneau.java
    │   │   ├── Medecin.java
    │   │   ├── Patient.java
    │   │   ├── RendezVous.java
    │   │   ├── Secretaire.java
    │   │   ├── Specialite.java
    │   │   ├── Utilisateur.java
    │   ├── dao/
    │   │   ├── CreneauDAO.java
    │   │   ├── MedecinDAO.java
    │   │   ├── PatientDAO.java
    │   │   ├── RendezVousDAO.java
    │   │   ├── SecretaireDAO.java
    │   │   ├── SpecialiteDAO.java
    │   │   ├── UtilisateurDAO.java
    ├── service/
    │   ├── RendezVousService.java
    │   ├── UtilisateurService.java
    ├── view/
    │   ├── MedecinView.java
    │   ├── SecretaireView.java
    │   ├── RendezVousView.java
    ├── Test.java

## Organisation DAO

    src/
    │   ├── dao/
    │   │   ├── CreneauDAO.java
    │   │   ├── MedecinDAO.java
    │   │   ├── PatientDAO.java
    │   │   ├── RendezVousDAO.java
    │   │   ├── SecretaireDAO.java
    │   │   ├── SpecialiteDAO.java
    │   │   ├── UtilisateurDAO.java
    │   ├── entities/
    │   │   ├── Creneau.java
    │   │   ├── Medecin.java
    │   │   ├── Patient.java
    │   │   ├── RendezVous.java
    │   │   ├── Secretaire.java
    │   │   ├── Specialite.java
    │   │   ├── Utilisateur.java
    │   ├── service/
    │   │   ├── MedecinService.java
    │   │   ├── PatientService.java
    │   │   ├── RendezVousService.java
    │   │   ├── SecretaireService.java
    │   │   ├── NotificationService.java
    │   │   ├── SpecialiteService.java
    │   │   ├── UtilisateurService.java
    │   ├── view/
    │   │   ├── MedecinView.java
    │   │   ├── PatientView.java
    │   │   ├── RendezVousView.java
    │   │   ├── LoginView.java
    │   │   ├── DashboardView.java
    │   │   ├── SpecialiteView.java
    │   │   ├── SecretaireView.java
    │   ├── Test.java


## Organisation MVC + DAO

src/
│   ├── dao/                      # Accès aux données
│   │   ├── CreneauDAO.java
│   │   ├── MedecinDAO.java
│   │   ├── PatientDAO.java
│   │   ├── RendezVousDAO.java
│   │   ├── SecretaireDAO.java
│   │   ├── SpecialiteDAO.java
│   │   ├── UtilisateurDAO.java
│   ├── model/                    # Modèle : Entités et logique métier
│   │   ├── Creneau.java
│   │   ├── Medecin.java
│   │   ├── Patient.java
│   │   ├── RendezVous.java
│   │   ├── Secretaire.java
│   │   ├── Specialite.java
│   │   ├── Utilisateur.java
│   ├── service/                  # Services : Logique métier utilisant DAO
│   │   ├── MedecinService.java
│   │   ├── PatientService.java
│   │   ├── RendezVousService.java
│   │   ├── SecretaireService.java
│   │   ├── NotificationService.java
│   │   ├── SpecialiteService.java
│   │   ├── UtilisateurService.java
│   ├── controller/               # Contrôleurs : Interactions entre la Vue et le Modèle
│   │   ├── MedecinController.java
│   │   ├── PatientController.java
│   │   ├── RendezVousController.java
│   │   ├── SecretaireController.java
│   │   ├── SpecialiteController.java
│   │   ├── UtilisateurController.java
│   ├── view/                     # Vues : Interface utilisateur
│   │   ├── MedecinView.java
│   │   ├── PatientView.java
│   │   ├── RendezVousView.java
│   │   ├── LoginView.java
│   │   ├── DashboardView.java
│   │   ├── SpecialiteView.java
│   │   ├── SecretaireView.java
│   ├── Test.java                  # Test de l'application
