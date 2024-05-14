package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;

/**
 * Servlet implementation class ELDemo
 */
public class ELDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = "java";
		request.setAttribute("name", name);
		StudentBean studentBean = new StudentBean();
		studentBean.setsName("amit");
		
		request.setAttribute("student", studentBean);
		
		request.getRequestDispatcher("eldemo.jsp").forward(request, response);
	}

}
