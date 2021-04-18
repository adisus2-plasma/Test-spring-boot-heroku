package com.example.demo_heroku;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoHerokuApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoHerokuApplication.class, args);
	}

	@GetMapping
	public String hello(){
		return "Hello Engine!!!!!";
	}
}
