package com.example.springFrameworkExample.annotations;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		/*ApplicationContext context =
				new ClassPathXmlApplicationContext
				("com/example/springFrameworkExample/annotations/beans.xml");
		*/
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Product harry = (Product)context.getBean("product");
		
		System.out.println(harry);
	}
}   