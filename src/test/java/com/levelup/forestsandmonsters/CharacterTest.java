package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import com.levelup.forestsandmonsters.GameController.DIRECTION;

public class CharacterTest {
    @Test
    public void initializationSetsNameToDefaultWhenEmpty() {
        Character testObj = new Character();
        assertEquals(Character.DEFAULT_NAME, testObj.getName());
        testObj = new Character("");
        assertEquals(Character.DEFAULT_NAME, testObj.getName());
        testObj = new Character("    ");
        assertEquals(Character.DEFAULT_NAME, testObj.getName());
    }

    @Test
    public void initializationSetsNameWhenNotEmpty() {
        Character testObj = new Character("Test Name");
        assertEquals("Test Name", testObj.getName());
    }

    @Test
    public void enterMapSetsMapAndStartingPosition() {
        Character testObj = new Character();
        GameMap m = new GameMap();
        testObj.enterMap(m);

        assertEquals(m, testObj.map);
        assertEquals(m.startingPosition, testObj.getPosition());
    }

    @Test
    public void moveCallsMapWithCorrectParams() {
        //Inject GameMap test double to allow us to test this
        Character testObj = new Character();
        FakeGameMap mockMap = new FakeGameMap();
        Position startingPosition = new Position(5,0);
        
        testObj.map = mockMap;
        testObj.currentPosition = startingPosition;

        testObj.move(DIRECTION.NORTH);

        assertEquals(mockMap.directionProvided, DIRECTION.NORTH);
        assertEquals(startingPosition, mockMap.startingPosition);

        assertEquals(mockMap.STUBBED_NEW_POSITION, testObj.currentPosition);
    }

}
