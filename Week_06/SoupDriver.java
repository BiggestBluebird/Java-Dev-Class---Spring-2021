package com.batson_java_course_2021.Week_06;

import java.util.HashSet;
import java.util.Set;

public class SoupDriver {

	public static void main(String[] args) {
		
		Set<Soup> soups = new HashSet<Soup>();
		
		soups.add(new Soup("Cream of broccoli", 250));
		soups.add(new Soup("Cream of mushroom", 175));
		soups.add(new Soup("Cream of chicken", 225));
		
		//System.out.println(soups);

		
		Soup newSoup = new Soup("Cream of broccoli", 250);
		
		if(soups.contains(newSoup)) {
			System.out.println("We already have that soup: " + newSoup);
		} else {
			System.out.println("Soup not found");
		}
		
		
		
		
		
		
		
	}

}
