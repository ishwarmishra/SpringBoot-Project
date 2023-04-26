package com.example.demo.model.productrepository;

import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.example.demo.model.entities.Product;
@RestResource 
public interface Productreposite extends JpaRepository<Product, Long>{
	public Product findByEmail(String email);

}