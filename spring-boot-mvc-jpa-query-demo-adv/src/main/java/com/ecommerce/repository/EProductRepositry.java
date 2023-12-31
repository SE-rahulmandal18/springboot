package com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.EProduct;

@Repository
public interface EProductRepositry extends JpaRepository<EProduct, Integer>, JpaSpecificationExecutor{
	
	// Derived queries
	List<EProduct> findAllByName(String name);
	
	List<EProduct> findAllByPrice(float price);
	
	List<EProduct> findAllByPriceGreaterThan(float price);
	
	
	// JPQL queries
	@Query("SELECT p FROM EProduct p WHERE p.name LIKE %:name%")
	List<EProduct> findAllByHavingNameAnywhere(String name);
	
	

	// JPQL queries
	@Query("SELECT p FROM EProduct p WHERE p.price > :minPrice and p.price < :maxPrice")
	List<EProduct> findAllWherePriceIsInBetween(float minPrice, float maxPrice);
	
	// SQL queries
	@Query(value="SELECT * FROM eproduct WHERE name LIKE %:name%", nativeQuery=true)
	List<EProduct> findAllByHavingNameAnywhereUsingSQL(String name);
	
	// Named Queries example
		List<EProduct> findAllWherePriceIs1000();
	
}