package com.hopecompany.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hopecompany.webservice.entities.Product;

//JPA REPOSITORY É UMA INTERFACE
public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
