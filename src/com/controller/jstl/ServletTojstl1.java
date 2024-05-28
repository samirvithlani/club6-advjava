package com.controller.jstl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;

/**
 * Servlet implementation class ServletTojstl1
 */
public class ServletTojstl1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		ArrayList<ProductBean> products = new ArrayList<ProductBean>();
		ProductBean p1= new ProductBean();
		p1.setpName("iphone");
		p1.setpPrice(1000);
		ProductBean p2= new ProductBean();
		p2.setpName("iphone 15");
		p2.setpPrice(1200);
		products.add(p1);
		products.add(p2);
		
		
		String name = "race";
		String users[] = new String[4];
		users[0]="ram";
		users[1]="amit";
		users[2]="kunal";
		users[3]="parth";
		
		request.setAttribute("name", name);
		request.setAttribute("users", users);
		request.setAttribute("products", products);
		request.getRequestDispatcher("/jstl/coretag2.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
