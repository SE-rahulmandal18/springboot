package com.simpli.storeapp.domain;

import java.time.LocalDate;

public class Product {
   
	private int id;
	private String name;
	private double price;
	private LocalDate manufacturingDate;
	
	public Product() {
		
	}

	public Product(String name, double price, LocalDate manufacturingDate) {
		super();
		this.name = name;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
	}

	public Product(int id, String name, double price, LocalDate manufacturingDate) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	@Override
	public String toString() {
		return "\nProduct [id=" + id + ", name=" + name + ", price=" + price + ", manufacturingDate=" + manufacturingDate
				+ "]";
	}
	
	
}
