package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.entities.Product;
import com.example.demo.model.productrepository.Productreposite;

@Controller
@RequestMapping("/products")
public class Productcontroller {
	
	@Autowired
	Productreposite productRepo; 
	
	@RequestMapping("")
	public String products(Model model) {
		List<Product> products =(ArrayList<Product>) productRepo.findAll();
		model.addAttribute("products",products);
		return"products" ;
	}
	@GetMapping("/add")
	public String addProductform() {
		return"addProductform" ;
	}
	
	@PostMapping("/add")
	public String addProduct(
			@RequestParam("user_email")String email,
			@RequestParam("user_pwd")String password  
			) {  
		Product p = new Product(0,email,password);
		productRepo.save(p);
		
		String msg = "Login   Sucessful .....";
		return "redirect:/products";
	}
	@GetMapping("/update/{id}")
	public String updateProductForm(@PathVariable long id,Model model) {
		Product p =  productRepo.findById(id).get();
		model.addAttribute("product",p);
		return "updateProductForm";
	}
	@PostMapping("/update")
	public String updateProduct(@ModelAttribute("product")Product product) {
		productRepo.save(product);
		return "redirect:/products";
	}
	@ResponseBody
	@GetMapping("/delete/{id}")
	public boolean deleteProduct(@PathVariable long id) {
		Product p=productRepo.findById(id).get();
		productRepo.delete(p);
		return true;
		
	}
	
	
	
}
