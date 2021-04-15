package com.batson_java_course_2021.Week_03;

public class Spider2 {
	
		private double weight;
		private boolean hasLegs;
		private String food;
		private boolean isAquatic;

	public static void main(String[] args) {
		
		Slug gary = new Slug(.3, false, "algae", true);
		
		
		Spider2 itsy bitsy = new Spider2();
		peter.setFood("jar of flies");
		System.out.println(peter.getFood());
		peter.setIsAquatic(true);
		System.out.println(peter);
		
		//CONSTRUCTOR
		public Spider2(double weight, boolean hasLegs, String food, boolean isAquatic) {
			super();
			this.weight = weight;
			this.hasLegs = hasLegs;
			this.food = food;
			this.isAquatic = isAquatic;
		}
	}
}
		
		peter.setIsRadioactive(true);
		System.out.println("Is this spider radioactive? " + peter.getIsRadioactive());
					
	//SLUG SUBCLASS
	//	Slug dimebagdarrel = new Slug();
		//dimebagdarrel.setFood("algae");
		//System.out.println(dimebagdarrel.getFood());
		//dimebagdarrel.setIsAquatic(false);
		
	
	}

	

class Spider2 extends Animal2{
	
	public Spider2() {
		super();
	}
	
	//MEM VARS
	private boolean isRadioactive;
		
	//GETTERS AND SETTERS
	public boolean getIsRadioactive() { 
		return this.isRadioactive;
	}
	
	public void setIsRadioactive(boolean isRadioactive) {
		this.isRadioactive = isRadioactive;
	}
}	
		

class Slug extends Animal2 {
	public Slug();
		super();
		System.out.println("Created a slug...") {
		}
	
		public Slug(double weight, boolean hasLegs, String food, boolean isAquatic) {
			super(weight, hasLegs, food, isAquatic);
			this.weight = weight;
			this.hasLegs = hasLegs;
			this.food = food;
			this.isAquatic = isAquatic;
	}	
}