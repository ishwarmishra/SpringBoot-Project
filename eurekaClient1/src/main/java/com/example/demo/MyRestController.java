package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@RequestMapping("/greetings")
	public String greetings() {
		return "Hello to microservice architecture";
	}
	@RequestMapping ("/getProduct")
	public Product getProduct() {
		return new Product(123,"Jeans","Denim",2345f);
	}
	private Product Product(int i, String string, String string2, float f) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}