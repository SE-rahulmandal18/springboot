package com.simpli.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public void getAllProducts(Connection con) throws SQLException {
		
		//Statement
	 
		Statement satement = con.createStatement();
	 
	 ResultSet rst = satement.executeQuery("select *  from product");
	
	 
	 // Restultset Metadat
	 ResultSetMetaData metaData = rst.getMetaData();
	 
	 System.out.println(metaData.getColumnCount());
	 
	 for (int i = 1; i < metaData.getColumnCount(); i++) {
		 System.out.println(metaData.getColumnName(i)+" ");
	}
	 System.out.println();
	 
	 while(rst.next()) {
		 
		 System.out.println(rst.getInt(1)+"  "+rst.getString(2)+"  "+rst.getDouble(3));
		 
	 }
	}

	@Override
	public void createProduct(Connection con) throws SQLException {
		
		// prepared Statement
		
		PreparedStatement pst = con.prepareStatement("insert into product values(?,?,?)");
		pst.setInt(1, 5);
		pst.setString(2, "Lenovo Laptop");
		pst.setDouble(3, 45500);
		
		int i = pst.executeUpdate();
		
		System.out.println(i+" product inserted...");
	}

	@Override
	public void deleteProduct(Connection con) throws SQLException {
		
		PreparedStatement pst = con.prepareStatement("delete from product where id= ?");
		pst.setInt(1, 5);
		
      	int i = pst.executeUpdate();
		
		System.out.println(i+" product deleted...");
	}

	@Override
	public void updateProduct(Connection con) {
		
		
	}

	@Override
	public void updateProductPriceById(Connection con) throws SQLException {
		
	   // CallableStatement
		
		CallableStatement cst = con.prepareCall("{call updateProductPrice(?,?)}");
		
		cst.setDouble(1, 80000);
		cst.setInt(2, 3);
		
		System.out.println("Falg "+cst.execute());
		}
		
	}


