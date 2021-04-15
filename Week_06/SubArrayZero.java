package com.batson_java_course_2021.Week_06;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SubArrayZero {

	public static void main(String args[])
    {
        //STATIC VARS
		Scanner sc = new Scanner(System.in);
		List<Integer> nums = new ArrayList<Integer>(); 
		List<Integer> subArray = null; 
		new HashMap<Integer, List<Integer>>();
		int end;
		
		//GET AN ARRAY OF NUMBERS
		System.out.println("Give the numbers >> ");
		String[] s = null;
		try {
			s = null;
		} catch (NullPointerException e2) {
			e2.printStackTrace();
		}
		try {
			try {
				s = sc.nextLine().split(" ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		//CONVERT TO NUMBERS FROM THE STRING
		for(int i=0; i<s.length; i++) {
			nums.add(Integer.valueOf(s[i]));
		}
		
		System.out.println(nums.toString()); 
		
		
		//LOOP 1: ITERATE OVER THE NUMS 
		for(int i=0; i< nums.size(); i++) {
				end = i + 1; //MOVE THE END +1
		
		
		//LOOP 2: MOVE END TO THE RIGHT
		while(end <= nums.size()) {
			try {
				subArray = new ArrayList<>();
			} catch (Exception e) {
				e.printStackTrace();
			} //STRIPS ELEMENTS OUT AFTER EACH LOOP EVENT
			
		//Loop 3: FOR EACH STARTING ELEMENT LOOP TIL THE END OF end 
			for(int j=i; j<end; j++) {
				subArray.add(nums.get(j));
				nums.get(j);
			
			}
			System.out.println(subArray.toString());
			end++;
			
			}
		
		}
		
			
    }
	
}
