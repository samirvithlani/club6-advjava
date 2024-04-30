package com.controller.student;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.StudentDao;

/**
 * Servlet implementation class DeleteStudentController
 */
public class DeleteStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		int sId = Integer.parseInt(request.getParameter("id"));
		int res = new StudentDao().deleteStudent(sId);
		if(res>0) {
			
			request.setAttribute("deleted", "student Deleted...");
			request.getRequestDispatcher("ListStudentController").forward(request, response);
		}
		else {
			request.setAttribute("deleted", "student Not Deleted...");
			request.getRequestDispatcher("ListStudentController").forward(request, response);
		}
		
	}

}
