package com.batson_java_course_2021.Week_01;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Student {
	
	//MEM VARS
	private String firstName;
	private String lastName;
	private static int grade;
	
	//String firstName = "", lastName = "";
	
	static Student[] students = new Student[2];
	static Scanner sc = new Scanner(System.in);
	
	public Student() {
	}
	
	//CONSTRUCTORS
	public Student(String firstName, String lastName, int grade) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
	}
			
	//GETTERS AND SETTERS
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	
	//TOSTRING()
		/*(@Override)
		 FORMAT IS DIFFERENT THAN THE SLIDE, WHY?*/
		
		public String toString() {
			return "Student [firstName=" + firstName + ", lastName=" + lastName + ", grade=" + grade + "]";
		}

		/*public String toString() {
			return "Student: " + this.lastName + " " + this.firstName + " " + grade + "%";
		}*/
		
	//MAIN
	public static void main(String[] args) {
		
	    System.out.println("Enter First Name: ");

	    String firstName = sc.nextLine();  // Read First Name  input
	    
	    System.out.println("Enter Last Name: ");

	    String lastName = sc.nextLine();  // Read Last Name input
	    
	    System.out.println("Enter Grade: ");
	    
	    grade = Integer.valueOf(sc.nextLine());  // Read Grade input
	    
	    Student student = new Student(firstName, lastName, grade);
	    student.add(students);
	    
	    System.out.println();  // Output user input		
	    
	    System.out.println("Enrollment Completed.");
	    
	    for(int i=0; i<student.size(); i++) {
	    	System.out.println(students.length);
	    }
	    
	    List<Student> students = new ArrayList<Student>();
	    
	    
	    
	}

	void add(Student[] students2) {
		// TODO Auto-generated method stub
		
	}

	int size() {
		// TODO Auto-generated method stub
		return 0;
	}

}
