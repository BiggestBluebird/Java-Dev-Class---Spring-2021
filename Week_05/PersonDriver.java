package com.batson_java_course_2021.Week_05;

import java.util.List;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class PersonDriver {

	public static void main(String[] args) {
		
		Person p1 = new Person("Wonka", "Willie");
		Person p2 = new Person("Bond", "James");
		Person p3 = new Person("Hendrix", "Jimi");
		Person p4 = new Person("Cline", "Patsy");
		
		List<Person> people = new ArrayList<Person>();		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(new Person("Humpty", "Dumpty"));
		
		for(Person p : people) 
			System.out.println(p);
		
		
		Collections.sort(people);
		
		for(Person p : people) 
		System.out.println(people);

	}

}
