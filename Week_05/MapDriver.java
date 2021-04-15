package com.batson_java_course_2021.Week_05;

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;

public class MapDriver {
			//CREATE MAP
			static Map<Integer, String> parts = new HashMap<Integer, String>();
	
			public static void main(String[] args) {
		
		//LOAD MAP
				//key : value
		parts.put(999, "Motor Oil");
		parts.put(11, "Brake Pads");
		parts.put(818, "Gas Caps");
		parts.put(13, "Tires");
		
		//PERFORM AND LOOK UP, maps allows you to look up
		String part = parts.get(818);
		System.out.println("Part found: " + part);
		
		//CHANGE A VALUE
		parts.put(11,  "Enhanced Brake Pads");
		System.out.println(parts); //prints out all the parts
		
		//ITERATE OVER THE MAP, put it in a method(), code reuse
		//      Datatype             entry    map of entries
		//for(Map.Entry<Integer, String> p : parts.entrySet()) {
		//	System.out.println(p.getKey() + " : " + p.getValue()); //prints 		each part on it's own row because the parts are individually accessed 		/because it's a for loop
	
		printMap(parts);
	
	}
			
	public static void printMap(Map<Integer, String> map) {
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key - " + entry.getKey() + " : Value - " + 		entry.getValue());
			
			
		}
	}
	
}
