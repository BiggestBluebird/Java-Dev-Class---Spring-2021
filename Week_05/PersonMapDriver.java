package com.batson_java_course_2021.Week_05;

import java.util.Map;
import java.util.HashMap;

public class PersonMapDriver {

	public static void main(String[] args) {
		
		Person p1 = new Person("Wonka", "Willie");
		Person p2 = new Person("Bond", "James");
		Person p3 = new Person("Hendrix", "Jimi");
		Person p4 = new Person("Cline", "Patsy");
		
		Map<Integer, Person> pMap = new HashMap<Integer, Person>();
		pMap.put(111111111, p1);
		pMap.put(222222222, p2);
		pMap.put(333333333, p3);
		pMap.put(444444444, p4);
		
		//System.out.println(pMap);
		
		for(Map.Entry<Integer, Person> entry : pMap.entrySet()) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		
		
	}

}
