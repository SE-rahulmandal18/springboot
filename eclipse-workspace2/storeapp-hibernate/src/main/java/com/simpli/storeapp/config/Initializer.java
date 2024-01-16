package com.simpli.storeapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ComponentScan(basePackages = { "com.simpli.storeapp.config", 
		                        "com.simpli.storeapp.dao" 
		})

@PropertySource(value = { "classpath:application.properties" })
public class Initializer {

}
