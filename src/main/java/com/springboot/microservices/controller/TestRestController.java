package com.springboot.microservices.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
	
	@RequestMapping("/test")
	public String test() {
		return "VARUN";
	}

}
