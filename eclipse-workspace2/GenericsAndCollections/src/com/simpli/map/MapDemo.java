package com.simpli.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(123, "rqr");
		map.put(245, "ufk");
		map.put(4, "dse");
		map.put(4, "ajk");
		map.put(12, "sku");

		String value = map.get(123);
		System.out.println("value = "+value);
		
		Set<Entry<Integer,String>> entires = map.entrySet();
		
		// Entry is an interface 1. getKey()   2. getValue()
		
		for (Entry<Integer, String> entry : entires) {
			
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
	
	}

}
