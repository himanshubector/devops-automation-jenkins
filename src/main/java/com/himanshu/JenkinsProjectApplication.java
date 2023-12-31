package com.himanshu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class JenkinsProjectApplication
{

	@GetMapping
	public String getMessage()
	{
		return "Welcome to the World of Spring Boot Jenkins Integration....";
	}


	public static void main(String[] args) {
		SpringApplication.run(JenkinsProjectApplication.class, args);
	}

}
