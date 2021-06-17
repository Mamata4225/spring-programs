package com.xworkz.sanitizer;

import javax.annotation.processing.SupportedAnnotationTypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext("applicationContext.xml");

		Sanitizer sanitizer = container.getBean(Sanitizer.class);
		System.out.println(sanitizer);

		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) container;

		classPathXmlApplicationContext.close();
		System.out.println("container is closed");
	}

	public static void main() {
		Alchohol alchohol = new Alchohol("methanol", 65, 0.79);

		Sanitizer sanitizer = new Sanitizer("Degya", 550, "abc", 350, alchohol);
		System.out.println(sanitizer);
	}

}