package com.hopecompany.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hopecompany.webservice.entities.Product;
import com.hopecompany.webservice.repositories.ProductRepository;

@Service
public class ProductService {
	//buscar todos usarios e usuarios por id
	@Autowired //faz injeção de dependencia de modo automatico
	private ProductRepository repository;
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
	
}
