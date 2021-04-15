package com.batson_java_course_2021.Week_01;

//SETS UP THE CLASS AND MATCHES THE FILE .JAVA FILE NAME
public class StudentExample {
	
	//MEM VARS OF OUR CLASS
	private String firstName;
	private String lastName;
	private int grade;
	
	//CONSTRUCTORS - BUILDS OBJECT OF CLASS
	public StudentExample() {
	}
	
	//ESTABLISHES THE POSSIBLE FORMATS THAT CAN BE CALLED
	public StudentExample(String firstName, String lastName, int grade) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
	}
			
	public StudentExample(String firstName) {
		this.firstName = firstName;
	}
	
	public StudentExample(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
		
	//GETTERS AND SETTERS
	//GETS THE FIRST NAME
	public String getFirstName() {
		return firstName;
	}

	//SETS THE FIRST NAME, "THIS" REFERS TO THE STUDENTEXAMPLE CLASS
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	//GETS THE LAST NAME
	public String getLastName() {
		return lastName;
	}

	//SETS THE LAST NAME
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	//GETS THE GRADE
	public int getGrade() {
		return grade;
	}

	//SETS THE GRADE
	public void setGrade(int grade) {
		this.grade = grade;
	}

//MAIN METHOD, THIS IS THE PROGRAM STARTING POINT
	public static void main(String[] args) {
		
		//CONSTRUCT roy
		//class   obj name  = new   constructor
		StudentExample roy  = new StudentExample("roy");
		
		//PRINTING OUT THE FIRST NAME BY USING THE STUDENT EXAMPLE OBJECT NAME FROM THE CONSTRUCTOR
		System.out.println(roy.getFirstName());
		
		//SETTING THE LAST NAME TO ROYBISON
		roy.setLastName("roybison");
		
		//PRINTING OUT THE LAST NAME BY USING DOT NOTATION AND CALLING IT FROM
		System.out.println(roy.getLastName());
		
		//CONSTRUCTED sissy, GAVE HER PARAMETERS
		StudentExample sissy = new StudentExample("sissy", "roybison", 99);
		
		//USING DOT NOTATION, CALLED THE METHODS TO PRINT OUT THE PARAMETERS FROM THE sissy CONSTRUCTOR
		System.out.println(sissy.getFirstName() + " " + sissy.getLastName() + " " + sissy.getGrade() + "%");
		
		//RETURNS THE REQUESTED VALUES IN STRING FORMAT
		System.out.println(sissy.toString());
		
		//ADDS AN EXTRA LINE IN THE CONSOLE
		System.out.println();	
		 
		
		
			
	}

}






















