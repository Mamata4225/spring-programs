package com.xworkz.chocolate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

		Chocolate chocolate = container.getBean(Chocolate.class);
		System.out.println(chocolate.hashCode());

		Chocolate chocolate1 = container.getBean(Chocolate.class);
		System.out.println(chocolate1.hashCode());

		Chocolate chocolate2 = container.getBean(Chocolate.class);
		System.out.println(chocolate2.hashCode());

		Chocolate chocolate3 = container.getBean(Chocolate.class);
		System.out.println(chocolate3.hashCode());

		Chocolate chocolate4 = container.getBean(Chocolate.class);
		System.out.println(chocolate4.hashCode());

		Database database = container.getBean(Database.class);
		System.out.println(database);

		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) container;

		classPathXmlApplicationContext.close();
		System.out.println("container is closed");

	}
}
