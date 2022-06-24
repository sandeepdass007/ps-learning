package com.example.demo.cucumber.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertFalse;
import  static org.junit.jupiter.api.Assertions.assertTrue;

public class ScenarioOutlineStep {
    
    String validateName;
    String userName = "Sapient";
    boolean actResult;

    @Given("Given user {string}")
    public void givenUserName( String name) {
        validateName= name;
    }

    @When("Compare user name")
    public void compareUserName() {
        actResult= userName.equalsIgnoreCase(validateName);
    }

    @Then("The result should be {string}")
    public void theResultShouldBeResult(String result) {
        final Boolean expResult = Boolean.valueOf(result);
        if(expResult){
            assertTrue(actResult);
        }else {
            assertFalse(actResult);
        }
    }
}
