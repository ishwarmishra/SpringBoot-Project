package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apis")
public class Myrestcontroller {
	@RequestMapping("/products/{id}")
	public String getProduct(@PathVariable int id) {
		if(id==1) {
			return "one";
			
		}
		else if(id==2)
		{
			return "two";
					
		}
		else {
			return "three";
		}
	}
}