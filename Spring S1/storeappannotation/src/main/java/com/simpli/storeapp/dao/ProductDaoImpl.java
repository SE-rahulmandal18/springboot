package com.simpli.storeapp.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Component;

import com.simpli.storeapp.domain.Product;

@Component(value="productDao")
@Scope(value="singleton")
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	@Qualifier("mysqlJdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	
	/*
	 * public ProductDaoImpl(JdbcTemplate jdbcTemplate) { this.jdbcTemplate =
	 * jdbcTemplate; }
	 */
	
	@Override
	public int insert(Product product) {
		// PreparedStatement
		return jdbcTemplate.update("INSERT INTO PRODUCT_DETAILS VALUES (?,?,?,?)",
				product.getId(), 
				product.getName(),
				product.getPrice(), 
				Date.valueOf(product.getManufacturingDate()));
	}

	@Override
	public int update(Product product) {
		//Statement Object
		String sql = "update product_details set name='"
				      + product.getName()
				      + "', price="
				      + product.getPrice()
				      + ", manufacturing_date='"
				      + Date.valueOf(product.getManufacturingDate())
				      + "' where id="
				      + product.getId(); 
		
		return jdbcTemplate.update(sql);
	}

	@Override
	public int delete(final int id) {
		
		return jdbcTemplate.update("delete from product_details where id=?", 
				new PreparedStatementSetter() {

					@Override
					public void setValues(PreparedStatement ps) throws SQLException {
						ps.setInt(1, id);		
					}
			
		});
				
	}

	
	@Override
	public List<Product> getAllProducts() {
		
		return jdbcTemplate.query("select * from product_details", new ProductRowMapper());
			
		}

	@Override
	public Product getProductById(int id) {
		
		return jdbcTemplate.query("select * from product_details where id=?", 
				new Object[] {id}, 
				new ProductResultSetExtractor());
	}
}
