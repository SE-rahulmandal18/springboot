package com.simpli.storeapp.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class MySQLDBConfig {
	
	@Bean(name = {"mysqlDataSource"})
	@Scope(value = "singleton")
	public DataSource getDataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/storedb");
		dataSource.setUsername("root");
		dataSource.setPassword("Rahul@123");
		
		return dataSource;
	}

	@Bean(name = {"mysqlJdbcTemplate"})
	@Scope(value= "singleton")
	public JdbcTemplate getJdbcTemplate(
			@Autowired 
			@Qualifier("mysqlDataSource") DataSource dataSource) {
		
	    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	    return jdbcTemplate;
	}
}
