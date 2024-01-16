package com.simpli.storeapp.dao;

import java.sql.Date;

import org.springframework.jdbc.core.JdbcTemplate;

import com.simpli.storeapp.domain.Product;

public class ProductDaoImpl implements ProductDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public ProductDaoImpl(JdbcTemplate jdbcTemplate) {
	     this.jdbcTemplate = jdbcTemplate;	
	}

	@Override
	public int insert(Product product) {
		
		return jdbcTemplate.update("INSERT INTO PRODUCT_DETAILS VALUES (?,?,?,?)",
				product.getId(), 
				product.getName(),
				product.getPrice(), 
				Date.valueOf(product.getManufacturingDate()));
	}

}
