package com.levelup.champions.trophyhunt;

public class GameController {

    PlayerCharacter captainPushIt;
    GameMap map;

    public GameController() {
        captainPushIt = new PlayerCharacter();
        map = new GameMap();
    }

    public GameStatus getStatus() {
        return null;
    }

    public PlayerCharacter getPlayerCharacter(){
        return captainPushIt;
    }

    public GameMap getGameMap(){
        return map;
    }

}
