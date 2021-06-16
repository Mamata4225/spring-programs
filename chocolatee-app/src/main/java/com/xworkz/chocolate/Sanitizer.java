package com.xworkz.chocolate;

public class Sanitizer {

	private String name;
	private float price;
	private String brand;
	private int quantity;
	private Alchohol alchohol;
	
	public Sanitizer(String name, float price, String brand, int quantity, Alchohol alchohol) {
		super();
		this.name = name;
		this.price = price;
		this.brand = brand;
		this.quantity = quantity;
		this.alchohol = alchohol;
		System.out.println(this.getClass().getSimpleName()+" object created");
	
	}
	@Override
	public String toString() {
		return "Sanitizer [name=" + name + ", price=" + price + ", brand=" + brand + ", quantity=" + quantity
				+ ", alchohol=" + alchohol + "]";
	}

    
}

