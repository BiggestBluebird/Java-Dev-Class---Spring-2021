package com.batson_java_course_2021.Week_04;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class ListExample {  //or ListDriver

	public static void main(String[] args) {
		
		List<String> groceryList = new ArrayList<String>(); //store strings
		List<Integer> vector1 = new Vector<Integer>(Arrays.asList(7, 77, 777, 7777)); //store integers, no need to use ??.add(),
		
		groceryList.add("butter");  //0
		groceryList.add("milk"); //1
		groceryList.add("bread"); //2			+
	
	for(int i=groceryList.size(); i < 0; i--) {
		try {
		System.out.println("groceryList.get(i");
		} catch (IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		}
	
		//ENHANCED FOR LOOP
	for(Integer vec : vector1) {
		System.out.println(vec);
		}
	
		
	
	
	}

}
