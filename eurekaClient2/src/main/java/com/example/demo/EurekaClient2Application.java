package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient2Application.class, args);
	}
	
	@Bean
	@LoadBalanced
	RestTemplate getRestTemplate() {
		return new RestTemplate();
		
	}

}
