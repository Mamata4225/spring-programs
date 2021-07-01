package com.xworkz.book;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/form")
public class FormServlet extends HttpServlet{

	public FormServlet() {
		System.out.println(getClass().getSimpleName() +"  ");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		
		writer.print("welcome to your page  " +name );
	}
	
	
	
}