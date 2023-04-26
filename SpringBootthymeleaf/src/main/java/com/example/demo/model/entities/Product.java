package com.example.demo.model.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name=" thymeleafproduction")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private String email;
	private String password;
	

}