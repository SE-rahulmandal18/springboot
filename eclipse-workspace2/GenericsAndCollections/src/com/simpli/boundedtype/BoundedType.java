package com.simpli.boundedtype;

class AverageCalci<T extends Number>{
	
	public double average(T... numbers) { // Integer[] {1,2,3,4,5}
		
		 double sum = 0;
		 
		 for (T t : numbers) {            // Account 
			 
		   sum += t.doubleValue();	
		}
		 
		 return sum / numbers.length;
	}
}

public class BoundedType {

	public static void main(String[] args) {
		
		AverageCalci<Integer> iobj = new AverageCalci<Integer>();
        double iavg = iobj.average(2,4,5,6,7);	

        System.out.println("Average of Integers= "+iavg);
        
        AverageCalci<Float> fobj = new AverageCalci<Float>();
        double favg = fobj.average(2.4f,4f,5f,6.1f,7.2f);	

        System.out.println("Average of Floats = "+favg);
	}
     
}