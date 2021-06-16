package com.xworkz.chocolate;

public class Supermarket {

	private String name;
	private int noOfCounters;
	private Address address;
	private double gst;
	private Worker worker;

	public Supermarket(String name, int noOfCounters, Address address, double gst, Worker worker) {
		super();
		this.name = name;
		this.noOfCounters = noOfCounters;
		this.address = address;
		this.gst = gst;
		this.worker = worker;
		System.out.println(this.getClass().getSimpleName()+"object created");
	}

	@Override
	public String toString() {
		return "Supermarket [name=" + name + ", noOfCounters=" + noOfCounters + ", address=" + address + ", gst=" + gst
				+ ", worker=" + worker + "]";
	}

}
