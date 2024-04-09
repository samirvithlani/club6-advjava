package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service method called...");
		String strage = request.getParameter("age");
		int age = 0;
		if(strage!= null && strage!= "") {
			age =Integer.parseInt(strage);
		}
		String name = request.getParameter("name");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<h1> Name ="+name+"</h1>");
		out.print("<h1> Age  = "+age+"</h1>");
		
		
		
	}

}
