package com.ahmed.adel.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@GetMapping("/")
	public String ShowPage() {
		
		return "<h2> Welcome </h2>";
	}

}
