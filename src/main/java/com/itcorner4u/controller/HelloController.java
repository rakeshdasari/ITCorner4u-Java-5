package com.itcorner4u.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String helloWorld() {
		return "Sample message from HelloController!";
	}

}
