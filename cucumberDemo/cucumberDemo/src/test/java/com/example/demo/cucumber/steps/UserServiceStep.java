package com.example.demo.cucumber.steps;

import com.example.demo.cucumber.config.CucumberSpringConfigurations;
import com.example.cucumberDemo.entity.UserEntity;
import com.example.cucumberDemo.service.UserServiceImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@ContextConfiguration(classes = CucumberSpringConfigurations.class, loader = SpringBootContextLoader.class)
public class UserServiceStep {

    Long userId;

    UserServiceImpl userService= new UserServiceImpl();
    Optional<UserEntity> userById;
    @Given("User id to fetch user")
    public void userIdToFetchUser() {

        userId=1l;
    }

    @When("Submit user request")
    public void submitUserRequest() {
        userById = userService.getUserById(userId);

    }

    @Then("User should receive user data")
    public void userReceivesUserData() {
        assertEquals(userById.get().getId(),1);
    }

}
