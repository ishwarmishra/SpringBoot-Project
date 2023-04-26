package com.example.springFrameworkExample.autowiring;

import com.example.springFrameworkExample.autowiring.Category;

public class Product {
	int id;
	String name;
	float price;
	Category category; 
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Product(int id, String name, float price, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.category = category;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public float getPrice() {
		return price;
	}



	public void setPrice(float price) {
		this.price = price;
	}



	public Category getCategory() {
		return category;
	}



	public void setCategory(Category category) {
		this.category = category;
	}



	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	
}