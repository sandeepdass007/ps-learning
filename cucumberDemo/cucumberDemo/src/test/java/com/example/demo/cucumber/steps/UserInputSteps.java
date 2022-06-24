package com.example.demo.cucumber.steps;

import com.example.demo.cucumber.config.CucumberSpringConfigurations;
import com.example.cucumberDemo.entity.UserEntity;
import com.example.cucumberDemo.service.UserServiceImpl;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ContextConfiguration(classes = CucumberSpringConfigurations.class, loader = SpringBootContextLoader.class)
public class UserInputSteps {


    UserServiceImpl userService= new UserServiceImpl();
    List<String> objects;
    List<UserEntity> allUserByIds;
    @Given("User with input present")
    public void userWithInputPresent(DataTable table) {
        objects = table.asList(String.class);
    }

    @When("Submit get user  request")
    public void submitGetUserRequest() {
        final List<Long> ids = objects.stream().map(s -> Long.valueOf(s.trim())).collect(Collectors.toList());
        allUserByIds = userService.getAllUserByIds(ids);

    }
    @Then("Should get Unique list of users")
    public void shouldGetUniqueListOfUsers() {
        assertEquals(allUserByIds.stream(),4);
    }
}
