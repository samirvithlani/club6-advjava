package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.ProductDao;

/**
 * Servlet implementation class ListProductController
 */
public class ListProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		ProductDao productDao = new ProductDao();
		List<ProductBean>products = productDao.getAllProducts();
		//iterate...
		//jsp..
		//product object...
		request.setAttribute("products", products);
		request.getRequestDispatcher("productList1.jsp").forward(request, response);
		
		
	}

}
