package com.batson_java_course_2021.Week_03;

//IMPORTS NEEDED FOR FUNCTIONALITY
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {
	
	//MAIN, THE PROGRAM BEGINS HERE	
	public static void main(String[] args) {
		
		//CONSTRUCT THE SCANNER
		Scanner sc = new Scanner(System.in);
		
		//CONSTRUCT AN ARRAY TO HOLD THE ITEM ENTRIES
		List<Item> items = new ArrayList<Item>();
		
		//VARIABLES
		int type = 0; //SETS TYPE TO 0, USED BELOW TO CONNECT TYPE ENTERED TO ITEM NUMBER
		
		int id = 0;
		String name;
		double price; 
		
		double total = 0.00; //THE AMOUNT OF THE ENTIRE PURCHSE
		
		Item item; //1 = GROCERY, ETC.
		
		//running = true TO BE USED ONLY WITH "THIS" while LOOP
		boolean running = true;
		while(running) {
			
			item = null; //NOTHING TO ADD
		}
		
		//GET USER INPUT, DON'T WORRY ABOUT A (4) DONE ENTRY
		System.out.println("Enter type of item: (1) for Grocery. (2) for Clothing, (3) for Pharmacy, (4) Done");
		type = Integer.valueOf(sc.nextLine());
		
		if(type < 1 || type > 3) { //IF AN INVALID ENTRY END THE PROGRAM HERE
			running = false;
		}
		
		else {
			
			//DISPLAY EACH STRING "QUESTION" AND ACCEPT THE INPUT
			System.out.println("Enter id: ");
			id = Integer.valueOf(sc.nextLine());
			
			System.out.println("Enter name: ");
			name = sc.nextLine();
			
			System.out.println("Enter price: ");
			
			//DOUBLE.VALUEOF ACCEPTS AN INTEGER WHEN A STRING IS EXPECTED
			price = Double.valueOf(sc.nextLine());
			
			//CREATE THE ITEM AND ADD IT TO ARRAYLIST
			if(type == 1) {
			//SETS TYPE TO ONE FOR THE GROCERY ITEMS ENTERED	
			item = new Grocery(id, name, price);
			}
			
			else if(type == 2) {
			item = new Clothing(id, name, price);
			}
			
			else if(type == 3) {
			item = new Pharmacy(id, name, price);
			
			//PRINTS OUT EVERYTHING ENTERED UNDER THE SELECTED TYPE
			items.add(item);
			System.out.println(item);
		}

	}

			// PRINT OUT THE ITEMS IN ARRAYLIST
			System.out.println("Items: ");
			System.out.println(); //EMPTY LINE AFTER ITEMS FOR READABILITY
			for(int i=0; i<items.size(); i++) {
				System.out.println(items.get(i).getId() + (items.get(i).getName() + " $" + items.get(i).getPrice()));
		}
			
			//CALCULATE THE TOTAL TAX ON ALL ITEMS ENTERED
			System.out.println("Total: ");
			for(int i=0; i<items.size(); i++) {
				total += items.get(i).price * items.get(i).getTax();
			}

			//PRINT FORMATTED DATA
			System.out.printf("$%.2f", total);   
	}

}
