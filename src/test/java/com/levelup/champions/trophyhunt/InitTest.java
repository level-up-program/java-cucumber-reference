package com.levelup.champions.trophyhunt;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  plugin = {"pretty", "html:target/cucumber-report.html"},
  features = {"src/test/resources"},
  glue = {"com.levelup.champions.trophyhunt"}
)
public class InitTest {

    @Test
    public void characterInitializationTest(){
        
        // arrange
        int x_pos;
        int y_pos;
        int x_expectedResult = 0;
        int y_expectedResult = 0;
        PlayerCharacter p = new PlayerCharacter();
        
         //act
         x_pos = p.getx();
         y_pos = p.gety();
         
         //assert
         assertTrue(x_pos == x_expectedResult);
         assertTrue(y_pos == y_expectedResult);
    }

      @Test
    public void whenGameInititalizes(){
      //fail();
    } 
    
}
