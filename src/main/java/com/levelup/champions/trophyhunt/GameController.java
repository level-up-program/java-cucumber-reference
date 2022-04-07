package com.levelup.champions.trophyhunt;

public class GameController {

    PlayerCharacter captainPushIt;

    public GameController() {
        captainPushIt = new PlayerCharacter();
    }

    public GameStatus getStatus() {
        return null;
    }

    public PlayerCharacter getPlayerCharacter(){
        return captainPushIt;
    }

}
