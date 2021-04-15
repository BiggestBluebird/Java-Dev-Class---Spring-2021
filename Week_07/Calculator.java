package com.batson_java_course_2021.Week_07;

public class Calculator {
	
	//ADD METHOD, Ints
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	//OVERLOADED ADD METHOD, Strings
	public int add(String str1, String str2) {
		return Integer.parseInt(str1) + Integer.parseInt(str2);
	}
	
	
	//SUBTRACT METHOD
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
	
	public boolean compare(int num1, int num2) {
		if(num1 == num2) {return true;}
		else {return false;
		}	
		}
}
