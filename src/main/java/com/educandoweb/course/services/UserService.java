package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service //registra a classe como componente do spring
public class UserService {

	@Autowired //injeção de dependencia 
	private UserRepository repository;
	
	//retorna todos os usuarios do bdd
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(Long id) {
		Optional <User> obj =  repository.findById(id);
		return obj.get();
	}
}
