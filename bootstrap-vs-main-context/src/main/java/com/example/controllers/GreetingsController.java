package com.example.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/")
public class GreetingsController {

	@Value("${greetings}")
	private String message;
	
	@GetMapping("/greetings/message")
	public String greetings(){
		return message;
	}
	
}
