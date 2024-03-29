package com.simpli.dao;

import java.sql.Connection;
import java.sql.SQLException;

public interface ProductDAO {

	void getAllProducts(Connection con) throws SQLException;
	
	void createProduct(Connection con) throws SQLException;
	
	void deleteProduct(Connection con) throws SQLException;
	
	void updateProduct(Connection con) throws SQLException;
	
	
	
	// for callable statement
	
	void updateProductPriceById(Connection con) throws SQLException;
}
