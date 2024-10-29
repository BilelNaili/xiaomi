#Author: your.email@your.domain.com
Feature: Mi Door Window Sennsor 2

  Scenario: ajouter Mi Door Window Sennsor 2 au panier
    Given utilisateur sur la page du produit Mi Door Window Sennsor 2
    When utilisateur clique sur ajouter au panier
    Then le produit "Mi Door Window Sensor 2" est disponible dans le panier
