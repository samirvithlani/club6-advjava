package com.controller.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.dao.StudentDao;

/**
 * Servlet implementation class AddStudentController
 */
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StudentBean studentBean = new StudentBean();
		// jsp -->

		String sName = request.getParameter("txtStudentName");
		String sEmail = request.getParameter("txtStudentEmail");
		String sPassword = request.getParameter("pwdStudentPassword");
		String strAge = request.getParameter("txtStudentAge");
		String strMarks = request.getParameter("txtStudentMarks");
		int courseId = Integer.parseInt(request.getParameter("cid"));
		System.out.println(courseId);
		int sMarks = 0;
		int sAge = 0;

		if (strMarks != null && strMarks != "") {

			sMarks = Integer.parseInt(strMarks);
		}
		if (strAge != null && strAge != "") {
			sAge = Integer.parseInt(strAge);
		}
		
		studentBean.setsName(sName);
		studentBean.setsAge(sAge);
		studentBean.setsEmail(sEmail);
		studentBean.setsPassword(sPassword);
		studentBean.setsMarks(sMarks);
		
		
		//DAO...
		int res = new StudentDao().AddStudent(studentBean);
		if(res>0) {			
			request.setAttribute("isAdded", "Data added Successfully");
			request.getRequestDispatcher("AddStudent.jsp").forward(request, response);
		}
		else {
			request.getRequestDispatcher("AddStudent.jsp").forward(request, response);
			request.setAttribute("isAdded", "Data not added");
		}
		
		
		

	}

}
