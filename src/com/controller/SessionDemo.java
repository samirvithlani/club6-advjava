package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionDemo
 */
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//request :- 1 page -- 2page
		//session : globle --> till session invalidate
		//application : gloabal -<
		request.setAttribute("name1","c");
		HttpSession session = request.getSession();
		//browser cookies JSESSIONID
		session.setAttribute("name", "java");
		
		//request.getRequestDispatcher("SessionDemo.jsp").forward(request, response);
		
	}

}
