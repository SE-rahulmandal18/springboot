package com.simpli.generic;

class Generic<T> { // before 1.5v

	private T element;

	public Generic(T element) {

		this.element = element;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

}

public class GenericsMain {

	public static void main(String[] args) {

		Generic<Integer> obj1 = new Generic<Integer>(100);

		Generic<String> obj2 = new Generic<String>("Hello");
		
		//obj1 = obj2;
		
		
	}
}