package com.example.service;

import java.util.List;
import java.util.Map;

import com.example.domain.Product;

public interface IProductService {

	Product save(Product product);

	Product update(Product product);
	
	void patchProduct(Map<String, Object> updates, String id);

	void delete(String id);

	Product getProductById(String id);

	List<Product> getAllProducts();

	List<Product> getAllProductsByName(String name);

	List<Product> getAllProductsByPrice(Double price);
}
