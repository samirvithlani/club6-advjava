package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.StudentBean;
import com.util.DBConnection;

public class StudentDao {

	public List<StudentBean> getAllStudents() {
		List<StudentBean> studentList = new ArrayList<StudentBean>();
		Connection conn = DBConnection.getConnection();
		if (conn != null) {

			String selectSQL = "select * from student";
			try {
				PreparedStatement pstmt = conn.prepareStatement(selectSQL);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {

					StudentBean studentBean = new StudentBean();
					studentBean.setsId(rs.getInt("sid"));
					studentBean.setsName(rs.getString("sname"));
					studentBean.setsEmail(rs.getString("semail"));
					studentBean.setsAge(rs.getInt("sage"));
					studentBean.setsMarks(rs.getInt("smarks"));
					studentBean.setsPassword(rs.getString("spassword"));

					studentList.add(studentBean);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return studentList;

	}

	public int AddStudent(StudentBean studentBean) {

		int res = 0;

		Connection conn = DBConnection.getConnection();
		if (conn != null) {

			String insertSQL = "insert into student(sname,semail,spassword,sage,smarks)values(?,?,?,?,?)";
			try {
				PreparedStatement pstmt = conn.prepareStatement(insertSQL);
				pstmt.setString(1, studentBean.getsName());
				pstmt.setString(2, studentBean.getsEmail());
				pstmt.setString(3, studentBean.getsPassword());
				pstmt.setInt(4, studentBean.getsAge());
				pstmt.setInt(5, studentBean.getsMarks());

				res = pstmt.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return res;

	}

	public int deleteStudent(int sId) {

		int res = 0;

		Connection conn = DBConnection.getConnection();
		if (conn != null) {

			String DeleteSQL = "delete from student where sid = ?";
			try {
				PreparedStatement psPreparedStatement = conn.prepareStatement(DeleteSQL);
				psPreparedStatement.setInt(1, sId);
				res = psPreparedStatement.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return res;
	}

}
