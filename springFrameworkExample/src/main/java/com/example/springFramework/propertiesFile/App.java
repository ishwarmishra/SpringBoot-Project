package com.example.springFramework.propertiesFile;



import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context =
				new ClassPathXmlApplicationContext
				("com/example/springFramework/propertiesFile/beans.xml");
		
		Product harry = (Product)context.getBean("book");
		
		System.out.println(harry);
	}
}   