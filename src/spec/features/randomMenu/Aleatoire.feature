@aleatoire
Feature: Je me connect a l application  bouletcorp
  En tantque utilisateur je veux verifier  les widgets facebook twitter et tumblr sont bien affiches.

  @affichage_ok
  Scenario: Affichage des widgets
    Given Je me connect a l application  bouletcorp "http://www.bouletcorp.com"
    When Je clique sur le menu aleatoire
    Then Je me redirige vers une page "bouletcorp » "
    And Je verifie que Le widget facebook est affiche
    And Je verifie que Le widget twitter est affiche
    And Je verifie que Le widget Tumblr est affiche
    
