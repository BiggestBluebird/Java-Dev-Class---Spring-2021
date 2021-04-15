package com.batson_java_course_2021.Week_04;

//The Fibonacci sequence is a series of numbers where a number is the addition of the last two numbers, starting with 0, and 1.

	import java.util.ArrayList; //creates an array of objects

	import java.util.List;     	//creates an array of sequential elements
	
	public class Fibonacci {

		public static void main(String[] args) {
	    
			System.out.println(isFibonacci(8)); //ENTER NUMBER HERE TO BE TESTED
	    }
	    
		public static boolean isFibonacci(int n) {
	        if (n == 0 || n == 1) {
	            return true;
	        }
	        
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(0);
	        numbers.add(1);
	        boolean found = false;
	    
	        while (!found) {
	            if (numbers.get(numbers.size() - 1) > n) {
	                break;
	            }
	            
	            int next = numbers.get(numbers.size() - 1) + numbers.get(numbers.size() - 2);
	            if (next == n) found = true;
	            numbers.add(next);
	        }
	        
	        return found;
	    }
	}
