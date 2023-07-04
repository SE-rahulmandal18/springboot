package com.simpli.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simpli.entity.EProduct;

@Repository
public interface EProductRepositry extends JpaRepository<EProduct, Integer> {

}