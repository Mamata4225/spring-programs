package com.xworkz.chocolate;

public class Alchohol {

	private String name;
	private int bp;
	private double destiny;
	
	public Alchohol(String name, int bp, double destiny) {
		super();
		this.name = name;
		this.bp = bp;
		this.destiny = destiny;
		
		System.out.println(this.getClass().getSimpleName()+" object created");

	}

	@Override
	public String toString() {
		return "Alchohol [name=" + name + ", bp=" + bp + ", destiny=" + destiny + "]";
	}	
	
}
