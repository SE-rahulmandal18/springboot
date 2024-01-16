package com.simpli.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.simpli.entity.Manufacturer;

@Repository
public interface ManufacturerRepositry extends JpaRepository<Manufacturer, Integer> {

}