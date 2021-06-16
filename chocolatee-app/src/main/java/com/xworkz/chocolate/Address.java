package com.xworkz.chocolate;

public class Address {
    private String street;
    private int buildingNo;
    private int doorNo;
	private int pinCode;	
	private String area;
	
	public Address(String street, int buildingNo, int doorNo, int pinCode, String area) {
		super();
		this.street = street;
		this.buildingNo = buildingNo;
		this.doorNo = doorNo;
		this.pinCode = pinCode;
		this.area = area;
		
		System.out.println(this.getClass().getSimpleName()+"object created");
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", buildingNo=" + buildingNo + ", doorNo=" + doorNo + ", pinCode="
				+ pinCode + ", area=" + area + "]";
	}

	
}

