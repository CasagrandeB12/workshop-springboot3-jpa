package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.repositories.CategoryRepository;

@Service //registra a classe como componente do spring
public class CategoryService {

	@Autowired //injeção de dependencia 
	private CategoryRepository repository;
	
	//retorna todos os usuarios do bdd
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional <Category> obj =  repository.findById(id);
		return obj.get();
	}
}
