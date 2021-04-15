//WHERE THE FILE LIVES
package com.batson_java_course_2021.Week_05;

//LOAD BATMAN'S UTILITY BELT
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

//SHOW SOME CLASS (auto-generated)
public class PhoneBook {
	
	private static String name;

	//GOOD OLD MAIN
	public static void main(String[] args) {
		
		//WILL HOLD THE ENTRIES FOR THE PHONE BOOK IN <STRING, STRING> FORMAT
		Map<String, String> phoneBook = new HashMap<>();
		
		//SCANNER ACCEPTS THE ENTERED DATA
		Scanner sc = new Scanner(System.in);
		
		//HOW MANY TIMES TO ASK FOR INPUT
		int times = Integer.parseInt(sc.nextLine());
				
		//USE "times" TO SET THE "step" IN THE for LOOP
		for(int i=0; i<times; i++) {
			
			//GET THE NAMES AND NUMBERS THAT ARE ENTERED
			String name = sc.nextLine();
			String number = sc.nextLine();
		
			//PUTS THE CONSOLE ENTRIES INTO THE MAP  	
			phoneBook.put(name, number);
			
			//System.out.println(phoneBook);
		}
		
		//DECIDES IF THE ENTRIES ARE IN THE PHONE BOOK OR NOT
		while((name = sc.nextLine()) != null) {
		if(phoneBook.containsKey(name)) {
			System.out.println(name + " | " + phoneBook.get(name));
		} else {
			System.out.println(name + " | <No Listing>");
		}
		 		
		}
	}
}
