package com.levelup.forestsandmonsters;

import java.awt.Point;

public class GameController {
    Character character;
    GameMap map;

    public class GameStatus {
        // TODO: Add other status data
        public String characterName;
        public Point currentPosition;

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
        map = new GameMap();
        if(character == null)
        {
            this.character = new Character();
        }
        character.enterMap(map);
        this.status.characterName = this.character.name;
        this.status.currentPosition = this.character.getPosition().coordinates;
    }

    public GameStatus getStatus() {
        GameStatus snapshotStatus = new GameStatus();
        snapshotStatus.characterName = this.status.characterName;
        snapshotStatus.currentPosition = this.status.currentPosition;
        return snapshotStatus;
    }

    public void move(DIRECTION directionToMove) {
        character.move(directionToMove);
        this.status.currentPosition = character.getPosition().coordinates;
    }

    public void setCharacterPosition(Point coordinates) {
        if(character == null)
            this.character = new Character();
        this.character.currentPosition = new Position(coordinates.x, coordinates.y);
        this.status.characterName = this.character.name;
        this.status.currentPosition = this.character.currentPosition.coordinates;
    }

}
