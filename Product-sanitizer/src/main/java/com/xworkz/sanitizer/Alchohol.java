package com.xworkz.sanitizer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alchohol {

	@Value("methenol")
	private String name;
	@Value("65")
	private int bp;
	@Value("0.79")
	private double destiny;

	public Alchohol(String name, int bp, double destiny) {
		super();
		this.name = name;
		this.bp = bp;
		this.destiny = destiny;

		System.out.println(this.getClass().getSimpleName() + " object created");

	}

	public Alchohol() {

		System.out.println(this.getClass().getSimpleName() + " object created");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBp(int bp) {
		this.bp = bp;
	}

	public void setDestiny(double destiny) {
		this.destiny = destiny;
	}

	@Override
	public String toString() {
		return "Alchohol [name=" + name + ", bp=" + bp + ", destiny=" + destiny + "]";
	}

}
