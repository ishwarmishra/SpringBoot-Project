package com.example.springFrameworkExample.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("com/example/springFrameworkExample/beans/beans.xml");
		
		Product p1 = (Product)context.getBean("jeans");
		Product p2 = (Product)context.getBean("sneaker");
		//p1.name="levis jeans";
		
		System.out.println(p1);
		System.out.println(p2);
	}

}