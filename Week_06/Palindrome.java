/*
A program to determine if entered data is a palindrome (same forward as backward)

*/
package com.batson_java_course_2021.Week_06;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
			System.out.print("Enter any string : ");
	        Scanner sc = new Scanner(System.in);
	        String origString = sc.nextLine();
	        String reverseString = "";
	         
	        //NO REVERSE STRING METHOD IN JAVA. STRING HAD CHARARRAY.
	        char[] characters = origString.toCharArray();
            
	        //ITERATE
	        for( int i = characters.length - 1 ; i >= 0 ; i-- ) {
	            reverseString = reverseString + characters[i];
	        }
	        boolean result = origString.equalsIgnoreCase(reverseString);
	        System.out.println("The original String is equal to reverse String = " + result);
	        //CHECK PALINDROME STRING
	        if (origString.equals(reverseString)) {
	            System.out.println("String is a palindrome.");
	        } else {
	            System.out.println("String is not a palindrome.");
	        }
	        
	        sc.close();
	}	
}		
					