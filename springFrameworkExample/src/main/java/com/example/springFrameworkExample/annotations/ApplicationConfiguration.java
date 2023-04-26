package com.example.springFrameworkExample.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.example.springFrameworkExample.annotations")
@PropertySource("classpath:/application.properties")
public class ApplicationConfiguration {
	@Bean("product")
	public Product getProduct() {
		return new Product();
	}

}
