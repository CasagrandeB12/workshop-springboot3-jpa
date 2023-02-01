package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service //registra a classe como componente do spring
public class OrderService {

	@Autowired //injeção de dependencia 
	private OrderRepository repository;
	
	//retorna todos os usuarios do bdd
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		Optional <Order> obj =  repository.findById(id);
		return obj.get();
	}
}
