package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.repository.ProductRepository;

@SpringBootApplication
public class StoreappdemoMongodbApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StoreappdemoMongodbApplication.class, args);
	}

	@Autowired
	@Qualifier("productRepository")
	ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
	
		
	}

}
