package com.simpli.springzeroxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean("instr")
	public Instructor getInstructor() {
		return new Instructor(10, "Rahul");
	}

}
