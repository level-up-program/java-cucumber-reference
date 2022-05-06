package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {
    //TODO: If your stakeholder wants to call this CHARACTER, change var name for low representational gap
    static final String DEFAULT_PLAYER_NAME = "Player";
    public class GameStatus {
        //TODO: Add other status data
        public String playerName = "";
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
    }

    //TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION { 
        NORTH, SOUTH, EAST, WEST
    }

    //Pre-implemented to demonstrate ATDD
    public void createPlayer(String playerName) {
        if(playerName != null && !playerName.equals("")){
            status.playerName = playerName;
        }
        else {
            status.playerName = DEFAULT_PLAYER_NAME;
        }
    }

    public GameStatus getStatus() {
        return this.status;
    }

    public Point move(DIRECTION directionToMove) {
        //TODO: Implement move
        return null;
    }

}
