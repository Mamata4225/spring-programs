package com.xworkz.mobile.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobile_table")
public class MobileEntity implements java.io.Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "MOBILE_ID")
	private int id;

	@Column(name = "MOBILE_NAME")
	private String name;

	@Column(name = "MOBILE_BRAND")
	private String brand;

	@Column(name = "MOBILE_RAM")
	private int ram;

	@Column(name = "MOBILE_COST")
	private double cost;

	public MobileEntity(String name, String brand, int ram, double cost) {
		super();
		this.name = name;
		this.brand = brand;
		this.ram = ram;
		this.cost = cost;
	}

	public MobileEntity() {
		super();
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
		return "MobileEntity [mobileID=" + id + ", name=" + name + ", brand=" + brand + ", ram=" + ram + ", cost="
				+ cost + "]";
	}

}