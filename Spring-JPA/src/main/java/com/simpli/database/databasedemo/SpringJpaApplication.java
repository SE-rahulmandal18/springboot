package com.simpli.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.simpli.database.databasedemo.entity.Person;
import com.simpli.database.databasedemo.jdbc.PersonJdbcDao;
import com.simpli.database.databasedemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class SpringJpaApplication  implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("User id 10001 -> {}", repository.findById(10001));
		
		logger.info("Inserting  -> {}", 
				repository.insert(new Person("Tara", "Berlin", new Date())));
		
		logger.info("Update 10003 -> {}", 
				repository.update(new Person("Pieter", "Utrecht", new Date())));
		
		repository.deleteById(10002);
	
		logger.info("All users -> {}", repository.findAll());
		
		/*
 
		// While using JPA (ID is auto generated)
		logger.info("Inserting 10004 -> {}", 
				dao.insert(new Person("Tara", "Berlin", new Date())));
			*/
	}

}
