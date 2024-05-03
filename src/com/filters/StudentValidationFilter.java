package com.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.util.ValidationUtil;

/**
 * Servlet Filter implementation class StudentValidationFilter
 */
public class StudentValidationFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public StudentValidationFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("filter called...");
		String sName = request.getParameter("txtStudentName");
		String sEmail = request.getParameter("txtStudentEmail");
		String sPassword = request.getParameter("pwdStudentPassword");
		String strAge = request.getParameter("txtStudentAge");
		String strMarks = request.getParameter("txtStudentMarks");

		boolean flag = false;

		if (ValidationUtil.isEmpty(sName)) {
			// if isEmpty return true == sName =blank
			System.out.println("name empty,,,");
			request.setAttribute("sNameError", "Name is Required*");
			flag = true;
		}
		if (ValidationUtil.isEmpty(sEmail)) {
			System.out.println("email empty...");
			request.setAttribute("sEmailError", "Email is Required*");
			flag = true;
		}
		// all other validations...

		if (flag == true) {

			request.getRequestDispatcher("AddStudent.jsp").forward(request, response);
		} else {
			// next()
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
