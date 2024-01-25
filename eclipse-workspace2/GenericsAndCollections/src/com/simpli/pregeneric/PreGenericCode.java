package com.simpli.pregeneric;

class PreGeneric{  // before 1.5v
	
	private Object element;

	public PreGeneric(Object element) {
		super();
		this.element = element;
	}

	public Object getElement() {
		return element;
	}

	public void setElement(Object element) {
		this.element = element;
	}
	
	
}

public class PreGenericCode {

	public static void main(String[] args) {
		
       PreGeneric obj1 = new PreGeneric(100);
       PreGeneric obj2 = new PreGeneric("Hello world");
       
       obj1 = obj2;
       
       Integer i = (Integer) obj1.getElement(); // Its not a type safe code...
       
		
	}

}