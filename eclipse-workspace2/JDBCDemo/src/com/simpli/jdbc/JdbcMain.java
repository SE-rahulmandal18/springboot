package com.simpli.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;

import com.simpli.dao.ProductDAO;
import com.simpli.dao.ProductDAOImpl;

public class JdbcMain {

	public static void main(String[] args) {
		
		try(Connection con = ConnectionUtil.getConnection()) {
			
			ProductDAO dao= new ProductDAOImpl();
			
//			dao.createProduct(con);
////			dao.deleteProduct(con);
//			dao.updateProductPriceById(con);
			dao.getAllProducts(con);
			
			
//			Meta Data in JDBC------------------
			
//			Database metadata
			
			/*
			 * DatabaseMetaData metaData = con.getMetaData();
			 * 
			 * System.out.println("Database Name ="+ metaData.getDatabaseProductName());
			 * System.out.println("Database versio= "+metaData.getDatabaseProductVersion());
			 * 
			 * ResultSet rst = metaData.getTables(null, null, null, null);
			 * 
			 * while(rst.next()) { System.out.println(rst.getString("TABLE_NAME")); }
			 */
			
			
			
			
			
		
		}catch (Exception e) {
			
			e.printStackTrace();
		}

	}

}
