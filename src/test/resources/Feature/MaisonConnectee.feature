#Author: your.email@your.domain.com

Feature: Maison connectee
Scenario: choisir un produit de la page maison connectee

Given utilisateur sur la page maison connectee
When utilisateur clique sur le produit "Xiaomi Smart Air Fryer Pro 4L"
Then utilisateur de redirige ves la page du produit "Xiaomi Smart Air Fryer Pro 4L"
