package com.simpli.jdbc;

import java.sql.Connection;

import com.simpli.dao.ProductDAO;
import com.simpli.dao.ProductDAOImpl;

public class JdbcMain {

	public static void main(String[] args) {
		
		try(Connection con = ConnectionUtil.getConnection()) {
			
			ProductDAO dao= new ProductDAOImpl();
			
//			dao.createProduct(con);
//			dao.deleteProduct(con);
			dao.updateProductPriceById(con);
			dao.getAllProducts(con);
		
		}catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
