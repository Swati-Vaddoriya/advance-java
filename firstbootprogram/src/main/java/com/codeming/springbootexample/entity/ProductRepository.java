package com.codeming.springbootexample.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codeming.springbootexample.Product;


@Repository 
public interface ProductRepository extends  JpaRepository<Product,Integer> {
	
}
