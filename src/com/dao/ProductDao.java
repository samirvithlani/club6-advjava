package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.bean.ProductBean;
import com.util.DBConnection;

public class ProductDao {

	public int addProduct(ProductBean productBean) {

		Connection conn = DBConnection.getConnection();
		int res = 0;
		if (conn != null) {

			String insertSQL = "insert into product(pname,pprice,pqty,discount)values(?,?,?,?)";
			try {
				PreparedStatement pstmt = conn.prepareStatement(insertSQL);
				pstmt.setString(1, productBean.getpName());
				pstmt.setInt(2, productBean.getpPrice());
				pstmt.setInt(3, productBean.getpQty());
				pstmt.setInt(4, productBean.getpDisc());

				res = pstmt.executeUpdate();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return res;

	}
}
