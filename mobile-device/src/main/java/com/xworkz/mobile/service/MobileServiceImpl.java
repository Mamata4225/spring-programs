package com.xworkz.mobile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mobile.dao.MobileDAO;
import com.xworkz.mobile.dao.MobileDAOImpl;
import com.xworkz.mobile.dto.MobileDTO;

@Component
public class MobileServiceImpl implements MobileService {

	@Autowired
	private MobileDAOImpl daoImpl;
	boolean isValidData=true;

	public MobileServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + "service created");
	}
@Override
	public void validateMobileDetails(MobileDTO dto) {
		if(dto.getName()==null || dto.getName().length()<4) {
		 isValidData=false;
		System.out.println("provide valid input");
}
		if(isValidData)
		daoImpl.saveMobileDTO(dto);
		
	}

}
