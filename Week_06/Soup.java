package com.batson_java_course_2021.Week_06;

public class Soup {

	//MEM VARS
	private String flavor;
	private int calories;
	public String getFlavor() {
		return flavor;
	}
	
	//CONSTRUCTOR
	public Soup(String flavor, int calories) {
		super();
		this.flavor = flavor;
		this.calories = calories;
	}
	
	//TOSTRING()
	@Override
	public String toString() {
		return "Soup [flavor=" + flavor + ", calories=" + calories + "]";
	}

	@Override// hashCode returns a number, entry that is the same will return the same hashCode number
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calories;
		result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
		System.out.println(result);
		return result;
	}

	@Override //the equals contract
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Soup other = (Soup) obj;
		if (calories != other.calories)
			return false;
		if (flavor == null) {
			if (other.flavor != null)
				return false;
		} else if (!flavor.equals(other.flavor))
			return false;
		return true;
	}
	
}
