package com.hopecompany.webservice.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.hopecompany.webservice.entities.Order;
import com.hopecompany.webservice.entities.User;
import com.hopecompany.webservice.entities.enums.OrderStatus;
import com.hopecompany.webservice.repositories.OrderRepository;
import com.hopecompany.webservice.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	//Injeção de dependencia automatico
	@Autowired 
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
		
	//tudo que voce colocar dentro desse metodo vai ser executado quando a aplicação for iniciada
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u = new User(null ,"Maria", "maria@gmail.com", "99999999", "12345");
		User u1 = new User(null ,"Enio", "enio@gmail.com", "99999999", "12345");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u);
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		userRepository.saveAll(java.util.Arrays.asList(u, u1));
		orderRepository.saveAll(Arrays.asList(o1, o2));
	}
	
	
}
