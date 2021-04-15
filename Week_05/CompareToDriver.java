package com.batson_java_course_2021.Week_05;

import java.util.Scanner;

public class CompareToDriver {

	public static void main(String[] args) {
		
		//INITIALIZE THE SCANNER
		Scanner sc = new Scanner(System.in);
		
		//VARS
		String str1, str2; //2 vars on one line is okay
		int result; //getting a result
		
		boolean running = true; //STOPS THE WHILE LOOP AFTER FIRST RUN
		
		
		//USE A WHILE LOOP
		
			while (running) {
				System.out.println("Enter first string please: ");
				str1 = sc.nextLine();
				
				System.out.println("Go ahead and enter the second string:  ");
				str2 = sc.nextLine();
				
				if(str1.equals("quit") || str2.equals("quit")) { // if str1 or str2 == quit then the loop stops
						running = false;
				}else {		
						
				result = str1.compareTo(str2);
				System.out.println("\"" + str1 + "\".compareTo(\"" + str2 + "\") = " + result + "\n"); //COMPARE THE 2 STRINGS ALPHABETICALLY. lexicographically is in hexadecimal?
			} 
			}
		
			System.out.println("Goodbye ya'll...");
			
	}
}
