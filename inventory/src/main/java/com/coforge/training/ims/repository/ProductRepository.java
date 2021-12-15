package com.coforge.training.ims.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coforge.training.ims.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

//	there is no need to define a method named findById as 
//	it is a primary method and can be accessed directly without the 
//	need to define it here in repository interface
}
