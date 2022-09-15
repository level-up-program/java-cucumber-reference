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


}
