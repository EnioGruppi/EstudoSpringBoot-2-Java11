package com.hopecompany.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hopecompany.webservice.entities.Category;

//JPA REPOSITORY É UMA INTERFACE
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
