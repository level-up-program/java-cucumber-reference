package com.levelup.forestsandmonsters;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class Character {

    public static final String DEFAULT_NAME = "Player";
    String name;
    
    public Character(){
        this.name = DEFAULT_NAME;
    }
    
    public Character(String name) {
        if(name.trim().equals(""))
            this.name = DEFAULT_NAME;
        else
            this.name = name;
    }
    
    public String getName() {
        return name;
    }

}
