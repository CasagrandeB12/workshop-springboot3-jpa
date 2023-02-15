package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;

@Service //registra a classe como componente do spring
public class ProductService {

	@Autowired //injeção de dependencia 
	private ProductRepository repository;
	
	//retorna todos os usuarios do bdd
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional <Product> obj =  repository.findById(id);
		return obj.get();
	}
}
