package com.bridgelabz.employee;

//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import lombok.extern.slf4j.Slf4j;

//import lombok.extern.slf4j.Slf4j;


@SpringBootApplication
@EnableJpaRepositories
@Slf4j
public class EmployeePayRollSetUpApplication 
{


	public static void main(String[] args) 
	{
		ApplicationContext context = SpringApplication.run(EmployeePayRollSetUpApplication.class, args);
		log.info("EmployeePayRoll APP started in {} Environment"
				,context.getEnvironment().getProperty("environment"));
		log.info("EmployeePayRoll Database User is {}"
				,context.getEnvironment().getProperty("spring.datasource.username"));
	}

}
