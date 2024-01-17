package com.example.repository;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Product;


@Repository("productRepository")
@Scope("singleton")
public interface ProductRepository extends MongoRepository<Product, String> {

	List<Product> findByName(String name);
	
	List<Product> findByPrice(Double price);
}
