package com.hopecompany.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hopecompany.webservice.entities.Order;
import com.hopecompany.webservice.repositories.OrderRepository;

@Service
public class OrderService {
	//buscar todos usarios e usuarios por id
	@Autowired //faz injeção de dependencia de modo automatico
	private OrderRepository repository;
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return  obj.get();
	}
	
}
