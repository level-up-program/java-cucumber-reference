package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {
    Character character;

    public class GameStatus {
        // TODO: Add other status data
        public String characterName;
        public Point currentPosition;
        public int turnCount;

        @Override
        public String toString() {
            return "Character " + characterName + " was on position " + currentPosition.x + "," + currentPosition.y;
        }
    }

    GameStatus status;

    public GameController() {
        status = new GameStatus();
    }

    // TODO: Ensure this AND CLI commands match domain model
    public static enum DIRECTION {
        NORTH, SOUTH, EAST, WEST
    }


    public void createCharacter(String name) {
        this.character = new Character(name);
        this.status.characterName = character.getName();
    }

    public void startGame() {
        
    }

    public GameStatus getStatus() {
        GameStatus snapshotStatus = new GameStatus();
        snapshotStatus.characterName = this.status.characterName;
        return snapshotStatus;
    }

    public void move(DIRECTION directionToMove) {
        
    }

    //Exists for testability. Is not a system operation.
    public void setCharacterPosition(Point coordinates) {
       
    }

    // Exists for testability. Is not a system operation.
    public int getTotalPositions() {
        return -9999;
    }

}
