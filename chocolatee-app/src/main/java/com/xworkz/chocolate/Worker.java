package com.xworkz.chocolate;

public class Worker {

	private String name;
	private int age;
	private String gender;
	private long phoneNo;
	
	public Worker(String name, int age, String gender, long phoneNo) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phoneNo = phoneNo;
		
		System.out.println(this.getClass().getSimpleName()+"object created");
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", age=" + age + ", gender=" + gender + ", phoneNo=" + phoneNo + "]";
	}
	
	
	
}
