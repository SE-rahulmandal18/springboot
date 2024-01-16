package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.domain.Product;
import com.example.repository.ProductRepository;

@SpringBootApplication
public class StoreappdemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StoreappdemoApplication.class, args);
	}

	
	@Autowired
	@Qualifier("productRepository")
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
	
		
		/*
		 * productRepository.save(new Product(0, "Samsung", 2500.0));
		 * productRepository.save(new Product(0, "LG", 2400.0));
		 * productRepository.save(new Product(0, "Dell", 2100.0));
		 */
		
		System.out.println(productRepository.findAll());
	}

}
