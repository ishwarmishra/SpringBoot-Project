package com.example.springFrameworkExample.beans;                                                                                                            
                                                                                                                                                             
public class Product {                                                                                                                                       
	int id;                                                                                                                                                  
	String name;                                                                                                                                             
	float price;                                                                                                                                             
	                                                                                                                                                         
	                                                                                                                                                         
	public Product() {                                                                                                                                       
		super();                                                                                                                                             
		// TODO Auto-generated constructor stub                                                                                                              
	}                                                                                                                                                        
                                                                                                                                                             
	public Product(int id, String name, float price) {                                                                                                       
		super();                                                                                                                                             
		this.id = id;                                                                                                                                        
		this.name = name;                                                                                                                                    
		this.price = price;                                                                                                                                  
	}                                                                                                                                                        
                                                                                                                                                             
	public void setId(int id) {                                                                                                                              
		this.id = id;                                                                                                                                        
	}                                                                                                                                                        
                                                                                                                                                             
                                                                                                                                                             
	public void setName(String name) {                                                                                                                       
		this.name = name;                                                                                                                                    
	}                                                                                                                                                        
                                                                                                                                                             
                                                                                                                                                             
	public void setPrice(float price) {                                                                                                                      
		this.price = price;                                                                                                                                  
	}                                                                                                                                                        
                                                                                                                                                             
	                                                                                                                                                         
	                                                                                                                                                         
                                                                                                                                                             
	@Override                                                                                                                                                
	public String toString() {                                                                                                                               
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";                                                                            
	}                                                                                                                                                        
	                                                                                                                                                         
}
