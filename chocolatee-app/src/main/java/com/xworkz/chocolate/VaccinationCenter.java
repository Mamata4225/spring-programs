package com.xworkz.chocolate;

public class VaccinationCenter {
	
	private String name;
	private String vaccinName;
	private CenterAddress centeraddress;
	
	public VaccinationCenter(String name, String vaccinName, CenterAddress centeraddress) {
		super();
		this.name = name;
		this.vaccinName = vaccinName;
		this.centeraddress = centeraddress;
		
		System.out.println(this.getClass().getSimpleName()+" object created");
	}

	@Override
	public String toString() {
		return "VaccinationCenter [name=" + name + ", vaccinName=" + vaccinName + ", centeraddress=" + centeraddress
				+ "]";
	}

	
}
