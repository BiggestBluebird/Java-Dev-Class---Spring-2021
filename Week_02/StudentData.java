package com.batson_java_course_2021.Week_02;

// THE SCANNER
import java.util.Scanner;

import com.batson_java_course_2021.Week_01.Student;

public class StudentData {
	
	//MAIN
	public static void main(String[] args) {

		//CREATE AN ARRAY TO HOLD STUDENT DATA ENTRIES
		Student[] students = new Student[10];
		
		//LOCAL VARS
		String firstName;
		String lastName;
		int grade;
		
		//CONSTRUCT A SCANNER TO ASK FOR STUDENT DATA INPUT
		Scanner sc = new Scanner(System.in);
		
		//SET UP THE 
		int NUM_STUDENTS = students.length;
		int sum = 0;
		int average = 0;
		
		//LOOP THROUGH THE ENTRIES
		for(int i=0; i < NUM_STUDENTS; i++) {
			
			System.out.println("Enter Student First Name: ");
			firstName = sc.nextLine();
		
			System.out.println("Enter Student Last Name: ");
			lastName = sc.nextLine();
			
			System.out.println("Enter Student Grade on Entrance Test: ");
			grade = Integer.valueOf(sc.nextLine());
			
			//IF GRADE IS NEGATIVE MAKE IT 0
			if(grade < 0) {  //IF "TRUE" GRADE IS 0
				grade = 0;
			}
			
			//DISPLAY ENTERED DATA IN PROPER FORMAT
			students[i] = new Student(firstName, lastName, grade);
			System.out.println(students[i]);
		
		}
		
		//LOOP THROUGH THE GRADES AND ADD THEM TOGETHER and hold in "sum"
		for(int i=0; i<NUM_STUDENTS; i++) {
				sum += students[i].getGrade();
		}
		
		//DIVIDE GRADE TOTAL BY THE NUMBER OF STUDENTS
		average = sum / NUM_STUDENTS;
		System.out.println("Average Grade: " + average + "%");
		
		//CLOSE THE SCANNER
		sc.close();
	
	}
}	
