package com.batson_java_course_2021.Week_01;

public class FizzBuzz {
	
		    public static void main(String[] args) {
	        fizzBuzzGameInJava5(10);
	        }

	    private static void fizzBuzzGameInJava5(int num){
	        for (int i = 1; i <= num; i++) {
	            if (((i % 3) == 0) && ((i % 5) == 0))   // using && with % check if a multiple of 3 & 5
	                System.out.println("fizzbuzz");
	            else if ((i % 3) == 0)                  // using % check if a multiple of 3
	                System.out.println("fizz");
	            else if ((i % 5) == 0)                  // using % check if a multiple of 5
	                System.out.println("buzz");
	            else
	                System.out.println("buzzfizz");     // the rest are not a multiple of 3 or 5
	        }
	    
	    }
	    
	}

