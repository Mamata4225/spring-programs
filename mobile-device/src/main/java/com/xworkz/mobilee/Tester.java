package com.xworkz.mobilee;

import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.mobile.dao.MobileDAO;
import com.xworkz.mobile.dao.MobileDAOImpl;
import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.service.MobileService;
import com.xworkz.mobile.service.MobileServiceImpl;

public class Tester {

	public static void main(String[] args) {

		System.out.println("Start");
		ApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
		MobileDTO dto = new MobileDTO(2, "Samsung");
		
		MobileService ms=container.getBean(MobileServiceImpl.class);
		ms.validateMobileDetails(dto);
		System.out.println(dto);
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) container;
		classPathXmlApplicationContext.close();
		System.out.println("closed");
		
		System.out.println("End");
	}

}
