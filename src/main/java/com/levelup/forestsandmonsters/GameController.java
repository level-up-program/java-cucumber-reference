package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {

    public class GameStatus {
        //TODO: Add status data
        public String PlayerName = "";
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
    }

    public enum DIRECTION { 
        NORTH, SOUTH, EAST, WEST
    }

    public void createPlayer(String playerName) {
        //TODO: Create player
    }

    public GameStatus getStatus() {
        //TODO: Return status
        return this.status;
    }

    public Point move(DIRECTION directionToMove) {
        //TODO: Implement move
        return null;
    }

}
