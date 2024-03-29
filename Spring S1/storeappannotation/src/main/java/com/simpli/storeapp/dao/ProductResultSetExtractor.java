package com.simpli.storeapp.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.simpli.storeapp.domain.Product;

public class ProductResultSetExtractor implements ResultSetExtractor<Product>{

	@Override
	public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
        
		if(rs.next()) {
		Product product = new Product();
		product.setId(rs.getInt("id"));
		product.setName(rs.getString("name"));
		product.setPrice(rs.getDouble("price"));
		product.setManufacturingDate(rs.getDate("manufacturing_date").toLocalDate());
		
		return product;
	}
		return null;
	}
}
