Feature: ForestsAndMonsters
![Gamer](images/gamerErin.png)

I want to create a new custom character, setting only their name.
This split is VERY simple, to get us started. Just barebones game functionality.

Scenario Outline: Set player name
    Given the player's name is <playerNameInput>
    When the player sets their name
    Then the Game sets the player's name to <playerNameOutput>
    Examples:
        | playerNameInput | playerNameOutput |
        | "Michelle"          | "Michelle"           |
        | ""              | "Erin"         |
        | "Complicated name that is very long and strange" | "Complicated name that is very long and strange" |
        | "Name_$#*(" | "Name_$#*(" |

