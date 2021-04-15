package com.batson_java_course_2021.Week_04;

//LOAD UP THE UTILITY BELT
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

//SHOW SOME CLASS
public class Randomizer {
	
	//GENERATE AN ARRAY THAT IS BUILT TO HOLD EXACTLY 100 NUMBERS
	public static int[] a = new int[100];
	
	//STILL MAIN
	public static void main(String[] args) {
		
		//HOLD THE 100 HERE
		List<Integer> numbers = new ArrayList<Integer>();
		
		//MAKE THEM ALL RANDOM
		Random rnd = new Random();
		
		//GIMME A HUNDRED NUMBERS
		for(int i=0; i<100; i++) {
		
		//PLAY DEFENSE AGAINST EXCEPTIONS BY TRY/CATCHing THE METHODS
		// next.Int() and sort()	
		try {	
			
			numbers.add(rnd.nextInt());
			
			} catch(IllegalArgumentException e) {
				System.out.println("Justice for the Illegal Argument Exception: " + e.getMessage());
			} catch (UnsupportedOperationException e) {
				System.out.println("Never support an Unsupported Operation Exception: " + e.getMessage());
			} catch (NullPointerException e) {
				System.out.println("Oh no! Null Pointer Exception: " + e.getMessage());
			} catch (ClassCastException e) {
				System.out.println("Here comes a Class Cast Exception: " + e.getMessage());
			}
		}	
			
		try {
			//SORT THE RANDOM NUMBERS FROM SMALLEST TO LARGEST (MOST NEGATIVE TO MOST POSITIVE)
			Collections.sort(numbers);
		} catch (ClassCastException e) {
			System.out.println("Class Cast Exception has been detected: " + e.getMessage());
		} catch (UnsupportedOperationException e) {
			System.out.println("Warning. Here is an Unsupported Operation Exception" + e.getMessage());
		} catch (IllegalArgumentException e) {
			System.out.println("Legally speaking an Illegal Argument Exception has been exposed: " + e.getMessage());
		}
		
		//FOR LOOP TO PRINT THE ORDERED NUMBERS
		for(Integer number : numbers) {
			System.out.println(number);
		}
		
	}	
}
