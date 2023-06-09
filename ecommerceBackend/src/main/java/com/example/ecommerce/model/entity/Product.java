package com.example.ecommerce.model.entity;

import java.util.Date;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	String sku;
	String name;
	String description;
    @Column(name="unit_price")
	float unitPrice;
    @Column(name="image_url")
    String imageUrl;
    boolean active;
    @Column(name="units_in_stock")
    int unitsInStock;
    @Column(name="date_created")
    @CreationTimestamp
    Date dataCreated;
    @Column(name="last_updated")
    @UpdateTimestamp
    Date lastUpdated;
  
   @ManyToOne(cascade =CascadeType.ALL)
   ProductCategory category;
    
	

}
