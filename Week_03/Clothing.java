package com.batson_java_course_2021.Week_03;

public class Clothing extends Item implements TenPercentTax {
	
	public Clothing() {
		super();
	}
	
	public Clothing(int i, String n, double p) {
		super(i, n, p);
	}
	
	@Override
	public double getTax() {
		return TAX;
	}
}