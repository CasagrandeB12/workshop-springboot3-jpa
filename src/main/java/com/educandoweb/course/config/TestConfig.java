package com.educandoweb.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Configuration
@Profile("test") //exclusiva para perfil de teste
public class TestConfig implements CommandLineRunner{

	@Autowired //resolve a dependencia e faz a instanciação do userRepository no programa
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception { //tudo o que estiver dentro do metodo sera executado quando iniciado
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		//salvar usuarios no bdd
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
}
