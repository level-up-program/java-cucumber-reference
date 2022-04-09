Feature: ForestsAndMonsters
![Gamer](images/gamerErin.png)
    I want to create a new custom character, setting their name

    Scenario: Set player name
        Given the player's name is "Erin"
        When the player sets their name
        Then the Game sets the player's name to "Erin"
        
