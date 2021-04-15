package com.batson_java_course_2021.Week_05;

public class Person implements Comparable<Person>{

		//MEM VARS
		private String lastName;
		private String firstName;
		
		
		
		//CONSTRUCTORS
		public Person() {
			super();
		}
		
		public Person(String lastName, String firstName) {
			super();
			this.lastName = lastName;
			this.firstName = firstName;
		}
		
		//GET/SET
		
		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		
		//TO STRING
		@Override
		public String toString() {
			return lastName + ", " + firstName;
		}
		
		@Override
		public int compareTo(Person person) {
			int comp = this.lastName.compareTo(person.lastName);
			if(comp == 0)comp = this.firstName.compareTo(person.firstName);
			return comp;
		}
		
		
		
		
		
		
	
		
		
		
		
		
}
