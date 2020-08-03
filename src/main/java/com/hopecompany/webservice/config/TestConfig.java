package com.hopecompany.webservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hopecompany.webservice.entities.User;
import com.hopecompany.webservice.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	//Injeção de dependencia automatico
	@Autowired 
	private UserRepository userRepository;
	
	//tudo que voce colocar dentro desse metodo vai ser executado quando a aplicação for iniciada
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u = new User(null ,"Maria", "maria@gmail.com", "99999999", "12345");
		
		userRepository.saveAll(java.util.Arrays.asList(u));
	}
	
	
}
