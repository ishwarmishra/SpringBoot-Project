package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@RequestMapping("")
	public String home() {
		return " Home Page!";
	}
	
	@RequestMapping("/user")
	public String user() {
		return " User Page";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return " Admin Page";
	}
	

}
