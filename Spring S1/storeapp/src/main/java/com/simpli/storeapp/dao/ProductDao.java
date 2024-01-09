package com.simpli.storeapp.dao;

import java.util.List;

import com.simpli.storeapp.domain.Product;

public interface ProductDao {
	
	public int insert(Product product);
	public int update(Product product);
	public int delete(int id);
	
	public List<Product> getAllProducts();
	
	public Product getProductById(int id);

}
