package com.xworkz.chocolate;

import javax.annotation.processing.SupportedAnnotationTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		Supermarket supermarket = container.getBean(Supermarket.class);
        System.out.println(supermarket);
		
        
		Sanitizer sanitizer = container.getBean(Sanitizer.class);
        System.out.println(sanitizer);
        
        VaccinationCenter vaccinationCenter = container.getBean(VaccinationCenter.class);
        System.out.println(vaccinationCenter);
        
//		Chocolate chocolate = container.getBean(Chocolate.class);
//		System.out.println(chocolate.hashCode());
//
//		Chocolate chocolate1 = container.getBean(Chocolate.class);
//		System.out.println(chocolate1.hashCode());
//
//		Chocolate chocolate2 = container.getBean(Chocolate.class);
//		System.out.println(chocolate2.hashCode());
//
//		Chocolate chocolate3 = container.getBean(Chocolate.class);
//		System.out.println(chocolate3.hashCode());
//
//		Chocolate chocolate4 = container.getBean(Chocolate.class);
//		System.out.println(chocolate4.hashCode());
//
//		Database database = container.getBean(Database.class);
//		System.out.println(database);

		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) container;

		classPathXmlApplicationContext.close();
		System.out.println("container is closed");
//		main();
	}

	public static void main() {
		Worker worker = new Worker("manu", 24, "male", 1236547890l);
		Address address = new Address("xyz", 3, 144, 571253, "vijaynagar");

		Supermarket supermarket = new Supermarket("Dmart", 4, address, 2.3, worker);
		System.out.println(supermarket);
	}

	public static void main1() {
	  Alchohol alchohol = new Alchohol("methanol", 65, 0.79);
	  
	  Sanitizer sanitizer = new Sanitizer("Degya", 550, "abc", 350, alchohol);
	  System.out.println(sanitizer);
	}
	
	public static void main2() {
		  CenterAddress centerAddress = new CenterAddress(31, 14, 512363, "BTM");
		  
		  VaccinationCenter vaccinationCenter = new VaccinationCenter("iii", "covishield", centerAddress);
		  System.out.println(vaccinationCenter);
}


}