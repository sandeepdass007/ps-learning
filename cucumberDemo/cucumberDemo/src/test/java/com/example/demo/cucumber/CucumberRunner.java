package com.example.demo.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.example.demo.cucumber.steps","com.example.demo.cucumber.config"},
        dryRun = true,
        tags = "@ValidateName",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        monochrome = true)
public class CucumberRunner {
}
