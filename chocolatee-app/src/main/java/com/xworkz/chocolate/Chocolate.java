package com.xworkz.chocolate;

public class Chocolate {
	public String name;
	public String size;
	public double price;
	public String brand;

	 public Chocolate(String name, String size, double price, String brand) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
		this.brand = brand;
		System.out.println("four parameterized constructor");
	}

	public Chocolate(String name, String size) {
		super();
		this.name = name;
		this.size = size;
		System.out.println("two parameterized constructor");
	}
	public Chocolate() {
		System.out.println("Zero parameterized constructed");
		
	}
   
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Chocolate [name=" + name + ", size=" + size + ", price=" + price + ", brand=" + brand + "]";
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void taste() {
		System.out.println("invoked taste()");
		System.out.println("chocolate has taste");
	}

	public void stressReliver() {
		System.out.println("invoked stressReliver");
		System.out.println("Eat chocolate to reduce strees");
	}

}
