package com.simpli.instanceOf;

class Animal{
	
	public void eat() {
		System.out.println("Animal is eating some food");
	}
}

class Dog extends Animal{
	
	@Override
	public void eat() {
		System.out.println("Dog is eating some food");
		
	}
	
	public void sound() {
		System.out.println("Dog is barking...");
	}
}

class Cat extends Animal {
	
	@Override
	public void eat() {
	
		System.out.println("Cat is eating some food");
		
	}	
}

public class InstanceOfMain {

	public static void callMethods(Animal obj) {
		
		obj.eat();
		if(obj instanceof Dog)
		((Dog)obj).sound(); // method is hidden ,
		else
			System.out.println("some other object..");
	}
	
	public static void main(String[] args) {
		
		Animal obj;
		obj = new Cat(); // Upcasting // Runtime
		callMethods(obj);

	}

}
