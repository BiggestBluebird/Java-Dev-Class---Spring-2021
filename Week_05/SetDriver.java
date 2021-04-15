package com.batson_java_course_2021.Week_05;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

public class SetDriver {
	
	//DUPLICATES NOT ALLOWED
	public static Set<Integer> setA = new HashSet<Integer>();
	public static Set<Integer> setB = new TreeSet<Integer>();
	
	public static void main(String[] args) {
	
		//ADD AND ELEMENTS TO SETA
		setA.add(77);
		setA.add(4);
		setA.add(11);
		setA.add(13);
		setA.add(77);
		
		System.out.println("setA: " + setA);
		
		setB.addAll(Arrays.asList(77, 23, 5, 42, 13, 0)); //use addAll() to pass in an array
		
		System.out.println("setB: " + setB);
		boolean containsSeventySeven = false; 
		
		try {
			
			containsSeventySeven = setA.contains(77); 
		
		} catch(ClassCastException e) {
			e.getMessage();
		} catch(NullPointerException e ) {
			e.getMessage();
		}
		
		System.out.println("Does my setA contain 77? " + containsSeventySeven);
		
		//INTERSECTION - RETURNS ALL COMMON ELEMENTS IF THE TWO SETS
		Set<Integer> intersection = new HashSet<Integer>(setA);
		intersection.retainAll(setB);
		System.out.println("Intersection of setA and setB: ");
		System.out.println(intersection + "\n");
		
		//Difference
		Set<Integer> difference = new HashSet<Integer>(setA);
		difference.removeAll(setB);
		System.out.println("Difference - Remove all elements from setB not in setA: ");
		System.out.println(difference);
		
		
		
		
		
	}
}

