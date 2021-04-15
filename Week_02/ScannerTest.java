package com.batson_java_course_2021.Week_02;

//MAKES THE SCANNER, LIST AND ARRAYlIST AVAILABLE 
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

//ESTABLISHES THE CLASS NAME
public class ScannerTest {

//MAIN METHOD, THE PROGRAM WILL START FROM HERE	
	public static <Student> void main(String[] args) {
		
		// LOCAL VARS, THEY ARE UNDER THE MAIN METHOD
		String firstName = "", lastName = "";  //variable to hold the scanned in String
				
		//INTEGER ENTERED MUST BE POSITIVE
		int grade = -1;
		
		//CONSTRUCTS THE SCANNER
		Scanner sc = new Scanner(System.in);
		
		//List<Student> students = new ArrayList<Student>();
		
		//CREATES AN ARRAY TO HOLD EVERY STUDENT ADDED TO THE COURSE
		List<Student> students = new ArrayList<Student>();
		
		//FOR LOOP TO ITERATE THROUGH THE CONSOLE ENTRIES UNTIL THERE ARE 10 LISTED
		// start stop  step 
		for(int i = 0; i<10; i++) {
					
			//STUDENT METHOD TO SET THE FORMAT OF THE DATA ENTERED
			Student(firstName, lastName, grade);
		
			// STUDENT ENROLLMENT TOOL - BRANDON U - HOME OF THE FIGHTING BULLDOGS
			
			//SETS THE QUESTION THAT APPEARS IN THE CONSOLE
			System.out.println("Enter Student First Name: ");	
			
			//ASSIGNS THE ENTERED STRING TO "firstName"
			firstName = sc.nextLine();
		
			//SETS THE NEXT QUESTION THAT APPEARS IN THE CONSOLE
			System.out.println("Enter Student Last Name: ");
			
			//SETS THE ENTERED STRING TO "lastName" 
			lastName = sc.nextLine();
			
			//SETS THE FINAL QUESTION THAT APPEARS IN THE CONSOLE
			System.out.println("Enter Student Grade on Entrance Examination: ");
			grade = sc.nextInt();
			
			System.out.println("Congratulations. Student Enrolled! ");
		}
	}

	private static void Student(String firstName, String lastName, int grade) {
		// TODO Auto-generated method stub
		
	}

	//private static void Student(String firstName, String lastName, int grade) {
		
		
	}
	
	









