package com.xworkz.mobile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mobile.dao.MobileDAO;
import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.entity.MobileEntity;

@Component
public class MobileServiceImpl implements MobileService {

	@Autowired
	private MobileDAO mobileDAO;

	public MobileServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + "Object Created");
	}

	@Override
	public boolean validateMobileDTO(MobileDTO dto) {
		MobileEntity mobileEntity = new MobileEntity();
		mobileEntity.setName(dto.getName());
		mobileEntity.setBrand(dto.getBrand());
		mobileEntity.setRam(dto.getRam());
		mobileEntity.setCost(dto.getCost());

		boolean result = mobileDAO.saveMobileDTO(mobileEntity);
		if (result) {
			System.out.println("data saved");
			return true;

		} else {
			System.out.println("data not saved");
			return false;
		}
	}

}
