package com.example.springFrameworkExample.autowiring;



import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext
				("com/example/springFrameworkExample/autowiring/beans.xml");
		
		
		Product cbr = (Product)context.getBean("bike");
		
		System.out.println(cbr);
	}
}   