package com.levelup.forestsandmonsters.features;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.awt.Point;

import com.levelup.forestsandmonsters.GameController;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MoveSteps {

    GameController gc;
    int startX, startY, endX, endY;
    GameController.DIRECTION direction;
    Point currentPosition;
    int turnCount;
    int currentTurnCount;

    @Given("the character starts at position with XCoordinates {int}")
    public void givenTheCharacterStartsAtX(int startX) {
        this.startX = startX;
    }

    @Given("starts at YCoordinates {int}") 
    public void givenTheCharacterStartsAtY(int startY) {
        this.startY = startY;
    }

    @Given("the player choses to move in {word}")
    public void givenPlayerChoosesDirection(String direction) {
        this.direction = GameController.DIRECTION.valueOf(direction);
    }

    @Given("the turn count is {int}")
    public void givenTheTurnCountIs(int turnCount) {
        this.turnCount = turnCount;
    }

    @When("the character moves")
    public void theCharacterMoves() {
        gc = new GameController();
        gc.startGame();
        gc.setCharacterPosition(new Point(this.startX, this.startY));
        gc.move(this.direction);
        GameController.GameStatus status = gc.getStatus();
        this.currentPosition = status.currentPosition;
        this.currentTurnCount = status.turnCount;
    }

    @Then("the character is now at position with XCoordinates {int}")
    public void checkXCoordinates(int endX) {
        assertNotNull("Expected position not null", this.currentPosition) ;
        assertEquals(endX, this.currentPosition.x);
    }

    @Then("YCoordinates {int}")
    public void checkYCoordinates(int endY) {
        assertNotNull("Expected position not null", this.currentPosition);
        assertEquals(endY, this.currentPosition.y);
    }

    @Then("the new turn count is {int}")
    public void checkTurnCount(int turnCount) {
        assertEquals(turnCount, this.currentTurnCount);
    }

}
