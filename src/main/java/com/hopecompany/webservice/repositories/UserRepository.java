package com.hopecompany.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hopecompany.webservice.entities.User;

//JPA REPOSITORY É UMA INTERFACE
public interface UserRepository extends JpaRepository<User, Long>{
	
}
