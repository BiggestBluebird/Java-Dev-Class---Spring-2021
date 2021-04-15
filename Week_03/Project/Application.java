package com.batson_java_course_2021.Week_03.Project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import com.batson_java_course_2021.Week_03.Clothing;
import com.batson_java_course_2021.Week_03.Grocery;
import com.batson_java_course_2021.Week_03.Item;
import com.batson_java_course_2021.Week_03.Pharmacy;

public class Application {
    
	static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        ArrayList<Item> items = new ArrayList<>();
        ArrayList<Grocery> groceries = new ArrayList<>();
        ArrayList<Clothing> clothings = new ArrayList<>();
        ArrayList<Pharmacy> pharmacies = new ArrayList<>();

        boolean doneFlag = false;

        do {
            printMenu();
            int selection = getMenuSelection();

            switch (selection) {
                case 1: {
                    Grocery g = getGroceryDetails();
                    items.add(g);
                    break;
                }
                case 2: {
                    Clothing c = getClothingDetails();
                    items.add(c);
                    break;
                }
                case 3: {
                    Pharmacy p = getPharmacyDetails();
                    items.add(p);
                    break;
                }
                case 4: {
                    doneFlag = true;
                    break;
                }
                default: 
                    doneFlag = true;
            }
        } while (!doneFlag);

        // separate into types
        for (Item i: items) {
            if (i instanceof Grocery) {             //instance of?????
                groceries.add((Grocery)i);
            } else if (i instanceof Clothing) {
                clothings.add((Clothing)i);
            } else {
                pharmacies.add((Pharmacy)i);
            }
        }

        // sort by names
        groceries.sort(new Comparator<Grocery>() {
            @Override
            public int compare(Grocery left, Grocery right) {
                char[] leftName = left.name.toCharArray();
                char[] rightName = right.name.toCharArray();

                return compareCharArrays(leftName, rightName);
            }
        });

        clothings.sort(new Comparator<Clothing>() {
            @Override
            public int compare(Clothing left, Clothing right) {
                char[] leftName = left.name.toCharArray();
                char[] rightName = right.name.toCharArray();

                return compareCharArrays(leftName, rightName);
            }
        });

        pharmacies.sort(new Comparator<Pharmacy>() {
            @Override
            public int compare(Pharmacy left, Pharmacy right) {
                char[] leftName = left.name.toCharArray();
                char[] rightName = right.name.toCharArray();

                return compareCharArrays(leftName, rightName);
            }
        });

        // print them back out
        System.out.println("Items: ");
        for (Grocery g: groceries) {
            System.out.println(g);
        }

        for (Clothing c: clothings) {
            System.out.println(c);
        }

        for (Pharmacy p: pharmacies) {
            System.out.println(p);
        }
    }

    private static void printMenu() {
        System.out.println("Enter (1) for Grocery, (2) for Clothing, (3) for Pharmacy, (4) done: ");
    }

    private static int getMenuSelection() {
        return Integer.parseInt(scan.nextLine());
    }

    private static Grocery getGroceryDetails() {
        int id = Integer.parseInt(scan.nextLine());
        String name = scan.nextLine();
        double price = Double.parseDouble(scan.nextLine());
        return new Grocery(id, name, price);
    }

    private static Clothing getClothingDetails() {
        int id = Integer.parseInt(scan.nextLine());
        String name = scan.nextLine();
        double price = Double.parseDouble(scan.nextLine());
        return new Clothing(id, name, price);
    }

    private static Pharmacy getPharmacyDetails() {
        int id = Integer.parseInt(scan.nextLine());
        String name = scan.nextLine();
        double price = Double.parseDouble(scan.nextLine());
        return new Pharmacy(id, name, price);
    }

    private static int compareCharArrays(char[] left, char[] right) {
        if (left.length < right.length) {
            return -1;
        } else if (left.length > right.length) {
            return 1;
        }

        for (int i = 0; i < left.length; i++) {
            if (left[i] < right[i]) {
                return -1;
            } else if (left[i] > right[i]) {
                return 1;
            }
        }
        return 0;
    }
}


