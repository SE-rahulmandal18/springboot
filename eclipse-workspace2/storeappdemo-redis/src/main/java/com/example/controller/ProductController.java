package com.example.controller;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Product;
import com.example.exception.ProductNotFoundException;
import com.example.service.IProductService;

@RestController
@Scope("request")
public class ProductController {

	@Autowired
	@Qualifier("productService")
	private IProductService productService;

	@GetMapping(path = "/products", produces = "application/json")
	public Iterable<Product> getAllProducts() {

		return productService.getAllProducts();
	}

	@GetMapping(path = "/products/{id}", produces = "application/json")
	public Product getProductById(@PathVariable("id") String id) {

		Product product = null;
		try {
			product = productService.getProductById(id);
		} catch (NoSuchElementException ex) {
			throw new ProductNotFoundException("Product: " + id + " not found.");
		}
		return product;
	}

	@DeleteMapping(path = "/products/{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void deleteProductById(@PathVariable("id") String id) {

		productService.delete(id);
	}

	@PostMapping(path = "/products", consumes = "application/json", produces = "application/json")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Product addProduct(@RequestBody Product product) {

		return productService.save(product);
	}

	@PutMapping(path = "/products", consumes = "application/json", produces = "application/json")
	@ResponseStatus(code = HttpStatus.OK)
	public Product updateProduct(@RequestBody Product product) {

		return productService.update(product);
	}

	@PatchMapping(path = "/products/{id}", consumes = "application/json")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void pathcProduct(@RequestBody Map<String, Object> updates, @PathVariable("id") String id) {

		productService.patchProduct(updates, id);
	}

	@GetMapping(path = "/products/name/{name}", produces = "application/json")
	public List<Product> getAllProductsByName(@PathVariable("name") String name) {

		return productService.getAllProductsByName(name);
	}

	@GetMapping(path = "/products/price/{price}", produces = "application/json")
	public List<Product> getAllProductsByPrice(@PathVariable("price") Double price) {

		return productService.getAllProductsByPrice(price);
	}
}
