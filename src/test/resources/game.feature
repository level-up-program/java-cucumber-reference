Feature: Game

    Scenario: Start Game
        Given the player opens the game
        When game initializes
        Then character is created
        And Map created
        And Trophy created
        
