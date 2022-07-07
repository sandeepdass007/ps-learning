package com.pslearning.boot;

import com.pslearning.boot.component.TestingComponent;
import com.pslearning.boot.projection.UserProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Set;

@SpringBootApplication
public class SpringBootDemosApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootDemosApplication.class, args);
		TestingComponent testingComponent = applicationContext.getBean(TestingComponent.class);
		System.out.println("Entity -> " +  testingComponent.getAllUsers().toString());
		System.out.println("Daos -> " +  testingComponent.getAllUserDaos().toString());
		Set<UserProjection> allUserProjections = testingComponent.getAllUserProjections();
		for(UserProjection userProjection : allUserProjections) {
			System.out.println("Projections -> id -> " + userProjection.getId());
			System.out.println("Projections -> first_name -> " + userProjection.getFirstName());
			System.out.println("Projections -> last_name -> " + userProjection.getFirstName());
		}
	}

}
