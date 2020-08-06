package com.hopecompany.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hopecompany.webservice.entities.Category;
import com.hopecompany.webservice.repositories.CategoryRepository;

@Service
public class CategoryService {
	//buscar todos usarios e usuarios por id
	@Autowired //faz injeção de dependencia de modo automatico
	private CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
	
}
