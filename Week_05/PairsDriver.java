package com.batson_java_course_2021.Week_05;

import java.util.HashSet;
import java.util.Scanner;

public class PairsDriver {
		
		//GOOD OLD MAIN
	    public static void main(String[] args) {
	    
	    //INITIALIZE THE SCANNER	
	    Scanner sc = new Scanner(System.in);
	    
	    // HOW MANY PAIRS DO YOU WANT TO TEST?
	    int Pairs = sc.nextInt(); 
		
	    //ACCEPT THE NEXT ENTRY OF PAIRS
	    sc.nextLine(); 
		
	    //MAKE A CONTAINER TO HOLD THE ENTRIES
	    HashSet<String> used = new HashSet<>();
		
	    //ITERATE THROUGH THE PAIRS
	    for (int i = 0; i < Pairs; i++) { 
	    	
	    	//ACCEPT THE INPUT IN THE FORM OF A STRING
	    	String input = sc.nextLine(); 
		    
	    	//IS THE INPUT ON THE LIST? (TRUE OR FALSE)
	    	if (!used.contains(input)) { 
			used.add(input);
		    }
		    System.out.println(used.size());
		}
	}
}



