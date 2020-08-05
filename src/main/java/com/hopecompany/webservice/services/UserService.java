package com.hopecompany.webservice.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hopecompany.webservice.entities.User;
import com.hopecompany.webservice.repositories.UserRepository;

@Service
public class UserService {
	//buscar todos usarios e usuarios por id
	@Autowired //faz injeção de dependencia de modo automatico
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	
}
