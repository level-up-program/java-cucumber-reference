package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {

    public static final String DEFAULT_NAME = "Player";
    String name;
    GameMap map = null;
    Position currentPosition = null;

    
    public Character(){
        this.name = DEFAULT_NAME;
    }
    
    public Character(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void enterMap(GameMap map) {
        this.map = map;
        this.currentPosition = map.startingPosition;
    }

    public Position getPosition() {
        return currentPosition;
    }

    public void move(DIRECTION direction) {
        this.currentPosition = map.calculatePosition(this.currentPosition, direction);
    }



}
