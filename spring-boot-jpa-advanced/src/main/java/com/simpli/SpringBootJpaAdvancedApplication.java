package com.simpli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.simpli.entity.Course;
import com.simpli.repository.CourseRepository;

@SpringBootApplication
public class SpringBootJpaAdvancedApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CourseRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaAdvancedApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Course course = repository.findById(10001L);

		logger.info("Course 10001 -> {}", course);
		
		//repository.deleteById(10001L);
		
		//repository.save(new Course("Microservices in 100 Steps"));
		repository.playWithEntityManager();
	}

}
