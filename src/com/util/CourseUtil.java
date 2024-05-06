package com.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.CourseBean;

public class CourseUtil {

	public  static List<CourseBean> getAllCourse() {

		List<CourseBean> courses = new ArrayList<CourseBean>();

		Connection conn = DBConnection.getConnection();
		if (conn != null) {

			String selectSQL = "select * from course";
			try {
				PreparedStatement pstmt = conn.prepareStatement(selectSQL);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {

					CourseBean courseBean = new CourseBean();
					courseBean.setcId(rs.getInt("cid"));
					courseBean.setcName(rs.getString("cname"));
					courseBean.setcDur(rs.getInt("cdur"));
					courseBean.setcPrice(rs.getInt("cprice"));

					courses.add(courseBean);

				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return courses;

	}
}
