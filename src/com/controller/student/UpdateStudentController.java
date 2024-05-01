package com.controller.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.dao.StudentDao;

/**
 * Servlet implementation class UpdateStudentController
 */
public class UpdateStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		StudentBean studentBean = new StudentBean();
		// jsp -->

		String sName = request.getParameter("txtStudentName");
		String sEmail = request.getParameter("txtStudentEmail");
		String sPassword = request.getParameter("pwdStudentPassword");
		String strAge = request.getParameter("txtStudentAge");
		String strMarks = request.getParameter("txtStudentMarks");
		System.out.println(request.getParameter("id"));
		int id = Integer.parseInt(request.getParameter("id"));
		int sMarks = 0;
		int sAge = 0;

		if (strMarks != null || strMarks != "") {

			sMarks = Integer.parseInt(strMarks);
		}
		if (strAge != null || strAge != "") {
			sAge = Integer.parseInt(strAge);
		}

		studentBean.setsName(sName);
		studentBean.setsAge(sAge);
		studentBean.setsEmail(sEmail);
		studentBean.setsPassword(sPassword);
		studentBean.setsMarks(sMarks);
		studentBean.setsId(id);

		// DAO...
		int res = new StudentDao().updateStudent(studentBean);
		// if
		response.sendRedirect("ListStudentController");

		doGet(request, response);
	}

}
