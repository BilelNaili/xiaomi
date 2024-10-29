#Author: your.email@your.domain.com

Feature: page d accueil xiaomi

Scenario: choisir une categorie de produit aa partir de la page d accueil
Given utilisateur accede a la page d accueil
When utilisateur navigue sur le menu "Smart Home" et clique sur la categorie "Maison connectée"
Then utilisateur redirige vers la categorie des produits "Maison Connectée"

