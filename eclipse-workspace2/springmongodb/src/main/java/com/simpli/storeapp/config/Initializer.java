package com.simpli.storeapp.config;

import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {
		"com.simpli.storeapp.dao",
		"com.simpli.storeapp.config"
})
public class Initializer {

}
