package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Product;
import com.example.repository.ProductRepository;

@Service("productService")
@Scope("singleton")
@Transactional
public class ProductService implements IProductService{

	@Autowired
	@Qualifier("productRepository")
	private ProductRepository productRepository;
	
	@Override
	public Product save(Product product) {
		
		return productRepository.save(product);
	}

	@Override
	public Product update(Product product) {

		return productRepository.save(product);
	}

	@Override
	public void delete(int id) {

		 productRepository.deleteById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Product getProductById(int id) {
	
		return productRepository.findById(id).get();
	}

	@Override
	@Transactional(readOnly = true)
	public List<Product> getAllProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public List<Product> getAllProductsByName(String name) {
		
		return productRepository.findByName(
				"%" + name + "%");
	}

	@Override
	public List<Product> getAllProductsByPrice(Double price) {
		
		return productRepository.findByPrice(price);
	}

	
}
