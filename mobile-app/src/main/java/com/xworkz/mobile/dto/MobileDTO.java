package com.xworkz.mobile.dto;

public class MobileDTO {

	private String name;
	private String brand;
	private int ram;
	private double cost;

	public MobileDTO() {
		System.out.println("MobileDTO object is created");
	}

	public MobileDTO(String name, String brand, int ram, double price) {
		super();
		this.name = name;
		this.brand = brand;
		this.ram = ram;
		this.cost = cost;
		System.out.println(this.getClass().getSimpleName() + "object created");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "MObileDTO [name=" + name + ", brand=" + brand + ", ram=" + ram + ", cost=" + cost + "]";
	}

}
