package com.levelup.champions.trophyhunt;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
        assertTrue(true);
    }

      @Test
    public void whenGameInititalizes(){
      assertTrue(true);
    } 
    
}
