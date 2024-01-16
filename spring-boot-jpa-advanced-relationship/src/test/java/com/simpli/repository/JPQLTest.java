package com.simpli.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.simpli.SpringBootJpaAdvancedApplication;
import com.simpli.entity.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;


//replaced @RunWith with @ExtendWith
//replaced SpringRunner.class with SpringExtension.class

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes=SpringBootJpaAdvancedApplication.class)
public class JPQLTest {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;

//	@Test
//	public void jpql_basic() {
//		Query query = em.createQuery("Select  c  From Course c");
//		List resultList = query.getResultList();
//		logger.info("Select  c  From Course c -> {}",resultList);
//	}
//
//	@Test
//	public void jpql_typed() {
//		TypedQuery<Course> query = 
//					em.createQuery("Select  c  From Course c", Course.class);
//		
//		List<Course> resultList = query.getResultList();
//		
//		logger.info("Select  c  From Course c -> {}",resultList);
//	}
//
//	@Test
//	public void jpql_where() {
//		TypedQuery<Course> query = 
//					em.createQuery("Select  c  From Course c where name like '%100 Steps'", Course.class);
//		
//		List<Course> resultList = query.getResultList();
//		
//		logger.info("Select  c  From Course c where name like '%100 Steps'-> {}",resultList);
//		//[Course[Web Services in 100 Steps], Course[Spring Boot in 100 Steps]]
//	}

	
	
	
    // Using NamedQuery 
	@Test
	public void jpql_basic() {
		Query query = em.createNamedQuery("query_get_all_courses");
		List resultList = query.getResultList();
		logger.info("Select  c  From Course c -> {}", resultList);
	}

	@Test
	public void jpql_typed() {
		TypedQuery<Course> query = em.createNamedQuery("query_get_all_courses", Course.class);

		List<Course> resultList = query.getResultList();

		logger.info("Select  c  From Course c -> {}", resultList);
	}

	@Test
	public void jpql_where() {
		TypedQuery<Course> query = em.createNamedQuery("query_get_100_Step_courses", Course.class);

		List<Course> resultList = query.getResultList();

		logger.info("Select  c  From Course c where name like '%100 Steps'-> {}", resultList);
		// [Course[Web Services in 100 Steps], Course[Spring Boot in 100 Steps]]
	}	
	
	
}