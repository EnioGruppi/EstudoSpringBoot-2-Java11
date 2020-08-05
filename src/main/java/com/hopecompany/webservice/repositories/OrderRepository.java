package com.hopecompany.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hopecompany.webservice.entities.Order;

//JPA REPOSITORY É UMA INTERFACE
public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
