package com.levelup.champions.trophyhunt;

public class GameController {

    private PlayerCharacter captainPushIt;
    private GameMap map;
    private Trophy championsTrophy;


    public GameController() {
        captainPushIt = new PlayerCharacter();
        map = new GameMap();
        championsTrophy = new Trophy();
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

    public Trophy getTrophy() {
        return championsTrophy;
    }

}
