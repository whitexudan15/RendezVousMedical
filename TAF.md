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
