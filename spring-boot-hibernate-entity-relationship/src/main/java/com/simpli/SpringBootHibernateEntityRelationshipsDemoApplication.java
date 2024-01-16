package com.simpli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({ "com.ecommerce.entity", "com.ecommerce", "com.ecommerce.repos", "com.simpli.relationship.o2m", "com.simpli.relationship.m2m" })
@EnableJpaRepositories
@SpringBootApplication
public class SpringBootHibernateEntityRelationshipsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateEntityRelationshipsDemoApplication.class, args);
	}

}