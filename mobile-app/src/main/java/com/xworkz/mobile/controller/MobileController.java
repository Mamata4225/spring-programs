package com.xworkz.mobile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.service.MobileService;

@Controller
public class MobileController {
	
	@Autowired
	private MobileService mobileService;
	
	public MobileController() {
		System.out.println(this.getClass().getSimpleName() + "Object is created");

	}

	@RequestMapping(value = "/mobile.do", method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute MobileDTO mobileDTO, Model model) {
		System.out.println("invoked onSubmit()");
		System.out.println(mobileDTO);

	 
		boolean result = mobileService.validateMobileDTO(mobileDTO);
		if (result) {
			model.addAttribute("ResponseMessage", "Thank You for submitting form, Data is saved");
		} else {
			model.addAttribute("ResponseMessage", "Something went wrong , Data is not saved");

		}
		return "MobileResponse";

	}

}