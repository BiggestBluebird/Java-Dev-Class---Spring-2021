package com.batson_java_course_2021.Week_03;

//ANIMAL SUPERCLASS
public class Animal2 /*EXTENDS THE OBJECT CLASS*/ {

	//MEM VARS
	private double weight;
	private boolean hasLegs;
	private String food;
	private boolean isAquatic;
	
	//CONSTRUCTORS, Super constructor from the super class
	public Animal2() {
		System.out.println("Created an animal.");
	}
	
	//the purpose of a constructor is to initialize the member variables
	public Animal2(double weight, boolean hasLegs, String food, boolean isAquatic) {
		super();  //calling object, not passing a parameter
		this.weight = weight;
		this.hasLegs = hasLegs;
		this.food = food;
		this.isAquatic = isAquatic;
		System.out.println("Executed this constructor with all params.");
	}
    
	//tOSTRING METHOD, articulate a few of the variables stored in the Animal2 class
	@Override
	public String toString() {
		return "Animal: " + "Food: " + food + " isAquatic: " + isAquatic;
		
	}
	
		public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isHasLegs() {
		return hasLegs;
	}

	public void setHasLegs(boolean haslegs) {
		this.hasLegs = haslegs;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public boolean isAquatic() {
		return isAquatic;
	}

	public void setAquatic(boolean isAquatic) {
		this.isAquatic = isAquatic;
	}

	//MAIN METHOD
	public static void main(String[] args) {
	
		//Spider2 itsyBitsy = new Spider2();
		
		Slug gary = new Slug(0.3, false, "algae", true);
		
		
		/*COMMENT OUT THE MAIN METHOD
		 * Animal2 fred = new Animal2();	
		//System.out.println(fred);

	//SPIDER SUBCLASS
		Spider2 peter = new Spider2();
		peter.setFood("jar of flies");
		System.out.println(peter.getFood());
		peter.setAquatic(true);
		System.out.println(peter);
		
		peter.setIsRadioactive(true);
		System.out.println("Is this spider radioactive? " + peter.getIsRadioactive());
					
	//SLUG SUBCLASS
		Slug dimebagdarrel = new Slug();
		dimebagdarrel.setFood("algae");
		System.out.println(dimebagdarrel.getFood());
		dimebagdarrel.setIsAquatic(false);
		
		TuskenRaider gary = new TuskenRaider();
		*/
	}
}

class Spider2 extends Animal2{
	
	public Spider2() {
		super();
		System.out.println("Created a Spider object...");
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
	
	//NO MEM VARS OF ITS OWN, GETS THEM FROM ANIMAL2
	
	public Slug() {
		super();
		System.out.println("Created a slug...");
	}
	
	public Slug(double weight, boolean hasLegs, String food, boolean isAquatic) {
		super(weight, hasLegs, food, isAquatic);
	}
}	
	
