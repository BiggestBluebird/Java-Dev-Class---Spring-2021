package com.batson_java_course_2021.Week_04;
	
	import 	java.math.*;
	import	java.security.*;
	import 	java.text.*;
	import	java.util.*;
	import 	java.math.*;
	import 	java.util.concurrent.*;
	import 	java.util.regex.*;
	import 	java.util.Scanner;
	import	java.util.ArrayList;
	import	java.util.List;
	 
	public class Hackerrank {
		
		// Complete the bonAppetit function below.
	    static void bonAppetit(List<Integer> bill, int k, int b) {
	    
	    }
	    
	    public static void main(String[] args)  {
	    
	    	List<Integer> bill = new ArrayList<>();
	    	Scanner sc = new Scanner(System.in);
	    	
	    	String[] nk = sc.nextLine().replaceAll("\\s+$", "").split(" ");
	    	System.out.println();
	    	        
	        int n = Integer.parseInt(nk[0]);

	        int k = Integer.parseInt(nk[1]);

	        String[] billItems = sc.nextLine().replaceAll("\\s+$", "").split(" ");
	        System.out.println();
	    
	        for (int i = 0; i < n; i++) {
	            int billItem = Integer.parseInt(billItems[i]);
	            bill.add(billItem);
	        }

	        int b = Integer.parseInt(sc.nextLine().trim());

	        bonAppetit(bill, k, b);

	        sc.close();
	    }
	}
/*
	bill = [2, 4, 6]; an array holding the cost of each item
	
	Anna should pay k = [0, 1];  
	
	print the amount of money Brian pays Anna
	
	 int k = [2]; Anna did not eat [2]
	
	b = amount of money Anna contributed
	
	split the array between 4 and 6
	