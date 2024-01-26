package com.simpli.fileio2;

import java.io.Serializable;

public class Book implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private double price;
	
	public Book() {
		
	}
	
	public Book(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
