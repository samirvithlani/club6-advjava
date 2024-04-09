package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ProductList
 */
public class ProductList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String pName = "iphone";
		int pprice = 123456;
		
		List<String> users = new ArrayList<String>();
		users.add("amit");
		users.add("akshit");
		users.add("ram");
		
		
		request.setAttribute("pname", pName);
		request.setAttribute("pprice",pprice);
		request.setAttribute("users", users);
		
		//request dispatcher
		
		RequestDispatcher rd = request.getRequestDispatcher("productList.jsp");
		rd.forward(request, response);
				
		
	}

}
