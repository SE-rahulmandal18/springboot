package com.example.repository;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Product;


@Repository("productRepository")
@Scope("singleton")
public interface ProductRepository extends CrudRepository<Product, String> {

	List<Product> findByNameEquals(String name);
	
	List<Product> findByPrice(Double price);
}
