package com.simpli.storeapp.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.config.MongoClientParser;

@Configuration
public class MongoDBConfig {

	/*
	 * @Bean(name = {"mongoDbFactory"})
	 * 
	 * @Scope("singleton") public MongoDatabaseFactory getMongoDatabaseFactory(){
	 * 
	 * MongoClient mongoClient =
	 * MongoClientParser.class("mongodb://localhost:27017"); }
	 */
}
