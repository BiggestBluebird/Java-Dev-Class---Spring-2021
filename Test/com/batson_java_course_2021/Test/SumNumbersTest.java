package com.batson_java_course_2021.Test;

public class SumNumbersTest {

	public static void main(String[] args) {
	     int[] array = {1, 2, 3, 4};
	      
	     int sum = 0;
	      
	      //Advanced for loop
	      for( int num : array) {
	          sum = sum + num;
	      }
	      System.out.println("Sum of this array of elements is:  " + sum);
	   }
	
	}