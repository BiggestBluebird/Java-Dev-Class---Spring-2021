package com.batson_java_course_2021.Week_03;

public class StarWarsPeople {

		//MEM VARS
		private String 	planet;
		private boolean hasForce;
		private boolean canDestroyPlanet;
		
		//CONSTRUCTOR
		public StarWarsPeople(String planet, boolean hasForce, boolean canDestroyPlanet) {
			super();
			this.planet = planet;
			this.hasForce = hasForce;
			this.canDestroyPlanet = canDestroyPlanet;
		}
		
		//GET/SET
		public String getPlanet() {
			return planet;
		}
		public void setPlanet(String planet) {
			this.planet = planet;
		}
		public boolean isHasForce() {
			return hasForce;
		}
		public void setHasForce(boolean hasForce) {
			this.hasForce = hasForce;
		}
		public boolean isCanDestroyPlanet() {
			return canDestroyPlanet;
		}
		public void setCanDestroyPlanet(boolean canDestroyPlanet) {
			this.canDestroyPlanet = canDestroyPlanet;
		}
			
		@Override
		public String toString() {
			return "StarWarsPeople [planet=" + planet + ", hasForce=" + hasForce + ", canDestroyPlanet=" + canDestroyPlanet + "]";
		}
			
//MAIN
		public static void main(String[] args) {
			
		StarWarsPeople jabba = new StarWarsPeople("Tattoine", false, false);
			System.out.println(jabba);
			
		SandPerson jeff = new SandPerson("tattoine", false, false);
			System.out.println(jeff);
			jeff.setBantha("Plushy the ferocious");
			System.out.println(jeff.getBantha());
		
	}	
}						
//SUBLASS
		class SandPerson extends StarWarsPeople {
			
			//MEM VARS
			private String bantha;
			
			//CONSTRUCTOR FOR SANDPERSON
			public SandPerson(String planet, boolean hasForce, boolean canDestroyPlanet) {
				super(planet, hasForce, canDestroyPlanet);
			}	

			//GET-SET
			public String getBantha() {
				return this.bantha;
			}

			public void setBantha(String bantha) {
				this.bantha = bantha;
			}
			
			
	}
				
//SUBCLASS
		class babySandPerson extends SandPerson {

			public babySandPerson(String planet, boolean hasForce, boolean canDestroyPlanet) {
				super(planet, hasForce, canDestroyPlanet);
				System.out.println("Created a baby sand person...");
			}
			
		
			
			
		}

			
		