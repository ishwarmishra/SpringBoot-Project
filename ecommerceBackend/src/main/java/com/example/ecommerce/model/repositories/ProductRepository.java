 package com.example.ecommerce.model.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.ecommerce.model.entity.Product;
@RepositoryRestResource
@CrossOrigin


public interface ProductRepository extends JpaRepository<Product, Long> {

}
