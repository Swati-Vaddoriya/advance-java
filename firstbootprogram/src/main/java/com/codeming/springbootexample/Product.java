package com.codeming.springbootexample;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCT")
public class Product {
	
	public String name;
	public int price;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {   
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", id=" + id + "]";
	}
	public Product(String name, int price, int id) {
		super();
		this.name = name;
		this.price = price;
		this.id = id;
	}
	
	
	
	
	

}
