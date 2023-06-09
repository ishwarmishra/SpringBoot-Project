package com.example.springFrameworkExample.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Category {
	int id;
	String name;
	public Category(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	@Value("${categoryId}")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value("${categoryName}")
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	
}