Feature: Game

Scenario: Start Game
    Given the player opens the game
    When game initializes
    Then character is created
    And Map is generated
    And 20 tiles have monsters
    And 10 tiles have treasure
    And 1 tile has trophy
    And character has a location
    And music starts

