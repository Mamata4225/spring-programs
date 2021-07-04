package com.xworkz.book.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class BookController {

	public BookController() {
        System.out.println(this.getClass().getSimpleName()+ "object created");
	}

	@RequestMapping(value = "/book.do")
	public String onSubmit(@RequestParam String BookName, @RequestParam String AuthorName, @RequestParam String edition,@RequestParam double cost ) {
		System.out.println("invoked onSubmit()");
		System.out.println(BookName + AuthorName + edition + cost);
	
		return "/WEB-INF/form.jsp";
	
	}
	
}