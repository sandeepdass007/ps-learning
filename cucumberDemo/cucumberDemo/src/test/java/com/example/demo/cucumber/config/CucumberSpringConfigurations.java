package com.example.demo.cucumber.config;

import com.example.cucumberDemo.CucumberDemoApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = CucumberDemoApplication.class)
public class CucumberSpringConfigurations {
}
