package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model) {
		String title = "Spring boot thymleaf";
		model.addAttribute("title",title);
		return "index.html";
	}
	
	@ResponseBody
	
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