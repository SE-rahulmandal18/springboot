package com.example.repository;

import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.domain.Product;
import java.util.List;


@Repository("productRepository")
@Scope("singleton")
public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByName(String name);
	
	List<Product> findByPrice(Double price);
}
