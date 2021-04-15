package com.batson_java_course_2021.Week_03;

public class Item {

		//MEM VARS
		private int    id;
		private String name;
		private double price;
		
		//CONSTRUCTOR
		public Item(int id, String name, double price) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
		}
		
		//GET/SET
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
			
		@Override
		public String toString() {
			return "PracticePad [id=" + id + ", name=" + name + ", price=" + price + "]";
		}

//MAIN
		public static void main(String[] args) {
			
		
		
	}	
}						

//SUBLASS
		class Grocery extends Item implements FivePercentTaxRate {
			
			//MEM VARS
			
			
			//CONSTRUCTOR FOR GROCERY

			//GET-SET
					
	}
				
//SUBCLASS
		class Clothing extends Item implements TenPercentTaxRate {

			//MEM VARS
			
			//CONSTRUCTOR FOR GROCERY

			//GET-SET
			
		
//SUBCLASS
			class Pharmacy extends Item implements SevenPercentTaxRate {

				//MEM VARS
				
				//CONSTRUCTOR FOR GROCERY

				//GET-SET
				
							
//SUBCLASS				
				public class Grocery extends Item implements FivePercentTax {
									
					public Grocery() {
						super();
					}
					
					public Grocery(int i, String n, double p) {
						super(i, n, p);
					}
					
					@Override
					public String toString() {
						return this.name.concat(String.valueOf(": " + String.format("%.2f", this.price * TAX)));
					}
				}	
				public interface FivePercentTax {
					
					public static final double TAX = 1.05d;
				}

//SUBCLASS				
				public class Clothing extends Item implements TenPercentTax {
										
					public Clothing() {
						super();
					}
					
					public Clothing(int i, String n, double p) {
						super(i, n, p);
					}
					
					@Override
					public String toString() {
						return this.name.concat(String.valueOf(": " + String.format("%.2f", this.price * TAX)));
					}
				}			
				public interface TenPercentTax {
					
					public static final double TAX = 1.1d;
				}

//SUBCLASS			
				public class Pharmacy extends Item implements SevenPercentTax {
					
					public Pharmacy() {
						super();
					}
					
					public Pharmacy(int i, String n, double p) {
						super(i, n, p);
					}
					
					@Override
					public String toString() {
						return this.name.concat(String.valueOf(": " + String.format("%.2f", this.price * TAX)));
					}
							
				
				
				public interface SevenPercentTax {
					
					public static final double TAX = 1.07d;
				}
				

			}
					
			
		