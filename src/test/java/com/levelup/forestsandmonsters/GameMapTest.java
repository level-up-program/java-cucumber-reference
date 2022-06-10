package com.levelup.forestsandmonsters;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.awt.Point;

public class GameMapTest {
    @Test
    public void initializationCreates100Positions() {
        GameMap testObj = new GameMap();

        assertEquals(10, testObj.getPositions().length);
        assertEquals(10, testObj.getPositions()[0].length);
    }

    @Test
    public void initializationCreatesPositionsWithCorrectCoordinates() {
        GameMap testObj = new GameMap();

        Point expectedLowerLeft = new Point(0,0);
        Point expectedUpperRight = new Point(9, 9);

        assertEquals(expectedLowerLeft, testObj.getPositions()[0][0].coordinates);
        assertEquals(expectedUpperRight, testObj.getPositions()[9][9].coordinates);
    }

}
