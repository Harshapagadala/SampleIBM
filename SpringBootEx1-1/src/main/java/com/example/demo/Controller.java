package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/w")
	public String welcome() {
		return"Welcome to the Spring Boot App development";
	}
	
}
