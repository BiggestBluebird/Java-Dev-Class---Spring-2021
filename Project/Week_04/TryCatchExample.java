package com.batson_java_course_2021.Week_04;

import java.util.NoSuchElementException;
import java.util.Random;

public class TryCatchExample {

	public static void main(String[] args) {
		/*
		//TRY CATCH EX. 1
		String str = "11";
		int num = 0;
		
		try {
			num = Integer.valueOf(str);
		} catch(NumberFormatException e) {
				e.printStackTrace();
		}
		
		System.out.println("This program did not in fact crash. num is: " + num);
			*/
		
		
		//TRY CATCH EXAMPLE NUMBER 2
		Random rn = new Random();
		
		int roll = 99;
		
		try {
			roll = rn.nextInt();
		} catch(IllegalArgumentException e) {
			System.out.println("IllegalArgumentException: " + e.getMessage());
		}
		
		System.out.println(roll);
			
		/*
		
		//TRY CATCH EXAMPLE NUMBER 3
		System.out.println("Example #3 ");
		
		try {
			
			throw new NoSuchElementException("No such element.");
			
		} catch(NoSuchElementException e) {
			System.out.println("Exception encountered trycatch in main: " + e.getMessage());
		}
		
		System.out.println("Program ended triumphantly!!");
		
		*/
	}

}


















