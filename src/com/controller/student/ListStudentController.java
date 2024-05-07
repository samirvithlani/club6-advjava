package com.controller.student;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.dao.StudentDao;
////ALTER TABLE student
//ADD COLUMN cid INT;
//
//-- 3. Add foreign key constraint to the `cid` column in the `student` table
//ALTER TABLE student
//ADD CONSTRAINT fk_student_cid
//FOREIGN KEY (cid)
//REFERENCES course(course_id);


/**
 * Servlet implementation class ListStudentController
 */
public class ListStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		List<StudentBean> students = new StudentDao().getAllStudents();
		request.setAttribute("students", students);
		request.getRequestDispatcher("ListStudent.jsp").forward(request, response);
	}

}
