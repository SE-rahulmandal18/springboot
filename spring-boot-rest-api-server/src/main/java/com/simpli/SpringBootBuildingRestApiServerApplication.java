package com.simpli;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"com.simpli.controller","com.simpli.entity", "com.simpli.repository" })
@EnableJpaRepositories
@SpringBootApplication
public class SpringBootBuildingRestApiServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBuildingRestApiServerApplication.class, args);
	}

}