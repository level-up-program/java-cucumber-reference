package com.levelup.champions.trophyhunt;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import com.levelup.champions.trophyhunt.GameController;
import com.levelup.champions.trophyhunt.GameStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InitDef {
    
    GameController gc;
    GameStatus gs;

    @Given ("the player opens the game")
    public void givenPlayerOpensGame(){

    } 
    
    @When ("game initializes")
    public void whenGameInititalizes(){
        gc = new GameController();
        //gs = gc.getStatus();
    } 
    
    @Then ("character is created")
    public void thenCharacterIsCreated(){
        assertNotNull(gc.getPlayerCharacter());
        //assert(gc.getPlayerCharacter().equals(new PlayerCharacter()));
    }

    @And ("Map created")
    public void thenMapGenerated(){
       assertNotNull(gc.getGameMap());
    }
/*
    @And ("20 tiles have monsters")
    public void thenMonstersCreated(){
        // Monster
        //MonsterList
        // assert();
    }

    @And ("10 tiles have treasure")
    public void thenTreasuresCreated(){
        //Treasure
        //TreasureList
        // assert();
    }
    @And ("1 tile has trophy")
    public void thenTrophyCreated(){
       //Trophy
        // assert();
    }
    @And ("character has a location")
    public void thenCharacterHasLocation(){
       //PlayerCharacter.getLocation();
        // assert();
    }
    @And ("music starts")
    public void thenMusicStarts(){
       //MusicManager
        // assert();
    }
    */
}
