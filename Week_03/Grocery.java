package com.batson_java_course_2021.Week_03;

public class Grocery extends Item implements FivePercentTax {
	
	public Grocery() {
		super();
	}
	
	public Grocery(int i, String n, double p) {
		super(i, n, p);
	}
	
	@Override
	public double getTax() {
		return TAX;
	}
}
