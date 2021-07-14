package com.xworkz.mobile.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.mobile.dao.MobileDAO;
import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.entity.MobileEntity;

@Component
public class MobileServiceImpl implements MobileService {

	public static Map<String, String> map = new HashMap<String, String>();
	@Autowired
	private MobileDAO mobileDAO;

	public MobileServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + "Object Created");
	}

	@Override
	public boolean validateMobileDTO(MobileDTO dto) {

//		MobileEntity mobileEntity = new MobileEntity();
//		mobileEntity.setName(dto.getName());
//		mobileEntity.setBrand(dto.getBrand());
//		mobileEntity.setRam(dto.getRam());
//		mobileEntity.setCost(dto.getCost());
//
//		boolean result = mobileDAO.saveMobileDTO(mobileEntity);
//		if (result) {
//			System.out.println("data saved");
//			return true;
//
//		} else {
//			System.out.println("data not saved");
//			return false;
//		}
		boolean flag = false;
		if (dto.getName() != null && !dto.getName().isEmpty() && dto.getName().length()<=5) {
			System.out.println("MobileName is valid");
			flag = true;
		} else {
			map.put("MobileName", "Name is invalid it must have min 5 charecters");
			flag = false;
		}

		if (dto.getBrand() != null && !dto.getBrand().isEmpty() && dto.getBrand().length() <= 5) {
           System.out.println("BrandName is valid");
           flag= true;
		}
		else {
			map.put("MobileBrand", "Brand is invalid it must have min 5 charecters");
		    flag = false;
		}
		
		if(dto.getRam()>=2) {
			System.out.println("Ram is valid");
			flag=true;
		}
		else {
			map.put("MobileRam", "Ram must be greaterthan 2GB ");
		    flag = false;
		}
		if(dto.getCost()>=10000) {
			System.out.println("Cost is valid");
			flag=true;
		}
		else {
			map.put("MobileCost", "Price must be above 10000");
		    flag = false;
		}
		
		if (flag == true) {

			MobileEntity mobileEntity = new MobileEntity();

			BeanUtils.copyProperties(dto, mobileEntity);
			boolean result = mobileDAO.saveMobileDTO(mobileEntity);
			return result ? true : false;
		} else {
			return false;
		}
	}
}
