package com.simpli.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.simpli.entity.Course;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class CourseRepository {	
	
	@Autowired
	EntityManager em;
	
	public Course findById(Long id){
		return em.find(Course.class, id);
	}
	
	
	//public Course save(Course course) -> insert or update

	public Course save(Course course) {
		
		if (course.getId() == null) {
			em.persist(course);
		} else {
			em.merge(course);
		}
		
		return course;
	}
	
	
	
	public void deleteById(Long id){
		Course course = findById(id);
		em.remove(course);
	}

	

//	public void playWithEntityManager() {
//		Course course = new Course("Web Services in 100 Steps");
//		em.persist(course);
//		course.setName("Web Services in 100 Steps - Updated");
//		

//		Course course1 = new Course("Web Services in 100 Steps");
//		em.persist(course1);	
//		
//		Course course2 = new Course("Angular Js in 100 Steps");
//		em.persist(course2);
//
//		em.flush();
//		
//		//em.clear();
// 
//		//em.detach(course2);
//		course1.setName("Web Services in 100 Steps - Updated");
//		course2.setName("Angular Js in 100 Steps - Updated");
//		
//		em.refresh(course1);
//		
//		em.flush();
		
		
		public void playWithEntityManager() {
			Course course1 = new Course("Web Services in 100 Steps");
			em.persist(course1);
			
			Course course2 = findById(10001L);
			
			course2.setName("JPA in 50 Steps - Updated");
		
		
		
		
	}
	
}
