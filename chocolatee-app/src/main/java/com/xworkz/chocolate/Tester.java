package com.xworkz.chocolate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Chocolate chocolate = container.getBean(Chocolate.class);
        System.out.println(chocolate);
        
        Database database= container.getBean(Database.class);
        System.out.println(database);
		
	
	
	}
}
