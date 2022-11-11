package com.BikkadIT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.core.recovery.ResilientSyslogOutputStream;

@SpringBootApplication
public class FirstGitJiraAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstGitJiraAppApplication.class, args);
		
		System.out.println("Working file");
	}

}
