package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.domain.Product;
import com.example.repository.ProductRepository;

@SpringBootApplication
public class StoreappdemoRedisApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(StoreappdemoRedisApplication.class, args);
	}

	@Autowired
	@Qualifier("productRepository")
	ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		

		productRepository.save(new Product("LG", 5454.0));
		productRepository.save(new Product("Samsung", 4542.0));
		productRepository.save(new Product("Mi", 5322.0));
		productRepository.save(new Product("Daikin", 15453.0));
		
		System.out.println(productRepository.findAll());
	}

}
