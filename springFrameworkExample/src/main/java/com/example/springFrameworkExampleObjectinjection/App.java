package com.example.springFrameworkExampleObjectinjection;



import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext
				("com/example/springFrameworkExampleObjectinjection/beans.xml");
		
		Product bmw = (Product)context.getBean("car");
		Product cbr = (Product)context.getBean("bike");
		System.out.println(bmw);
		System.out.println(cbr);
	}
}   