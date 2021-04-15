package com.batson_java_course_2021.Week_03;

public class Pharmacy extends Item implements SevenPercentTax {
	
	public Pharmacy() {
		super();
	}
	
	public Pharmacy(int i, String n, double p) {
		super(i, n, p);
	}
	
	@Override
	public double getTax() {
		return TAX;
	}
}