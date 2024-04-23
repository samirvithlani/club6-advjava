package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.ProductBean;
import com.dao.ProductDao;

/**
 * Servlet implementation class AddProductController
 */
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int pPrice = Integer.parseInt(request.getParameter("pprice"));
		int pDisc = Integer.parseInt(request.getParameter("pdisc"));
		int pQty = Integer.parseInt(request.getParameter("pqty"));
		String pName = request.getParameter("pname");
		
		ProductBean productBean = new ProductBean();
		productBean.setpName(pName);
		productBean.setpPrice(pPrice);
		productBean.setpQty(pQty);
		productBean.setpDisc(pDisc);
		
		ProductDao productDao = new ProductDao();
		int res = productDao.addProduct(productBean);
		if(res>0) {
			System.out.println("product inserted..");
			//redirect
			response.sendRedirect("ListProductController");
			
		}
		else {
			
			System.out.println("product not inserted..");
			//error...
			response.sendRedirect("ListProductController");
			
		}
		
		
	}

}
