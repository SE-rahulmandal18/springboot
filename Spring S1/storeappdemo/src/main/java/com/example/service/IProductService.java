package com.example.service;

import java.util.List;

import com.example.domain.Product;

public interface IProductService {

	Product save(Product product);

	Product update(Product product);

	void delete(int id);

	Product getProductById(int id);

	List<Product> getAllProducts();

	List<Product> getAllProductsByName(String name);

	List<Product> getAllProductsByPrice(Double price);
}
