package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoServelet
 */
public class DemoServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DemoServelet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("demo servelt called...");
		//mime type..
		int a = 10;
		int b = 20;
		int sum = a + b;
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h1>Hello</h1>");
		out.print("<h1> A = "+a+"</h1>");
		out.print("<h1> B ="+b+"</h1>");
		out.print("<h1> Sum = "+sum+"</h1>");
		
		out.close();
		
		
		
		
		
		
	}

}
