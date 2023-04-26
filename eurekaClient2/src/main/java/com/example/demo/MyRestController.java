package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/client2")
public class MyRestController {
	
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/greeting")
	public String greeting() {
		 return restTemplate.getForObject("http://client1/greetings",String.class );
		
		
	}
	@RequestMapping("/getProduct")
	public Product getProduct() {
		 return restTemplate.getForObject("http://client1/getProduct",Product.class );
		
		
	}
	
	
	
 
}