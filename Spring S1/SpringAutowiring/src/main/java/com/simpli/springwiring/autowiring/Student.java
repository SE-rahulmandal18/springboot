package com.simpli.springwiring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

	 private int id;
	 private Scores scores;
	 
	 public Student() {
	
	}
	 
	 
	public Student(int id, Scores scores) {
	
		this.id = id;
		this.scores = scores;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Scores getScores() {
		return scores;
	}
	
	@Autowired
	@Qualifier("scores345")
	public void setScores(Scores scores) {
		this.scores = scores;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", scores=" + scores + "]";
	}
	 
	 
}
