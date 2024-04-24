package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bean.ProductBean;
import com.util.DBConnection;

public class ProductDao {

	public int deleteProduct(int id) {

		Connection conn = DBConnection.getConnection();
		int res = 0;
		if (conn != null) {

			String deleteSQL = "delete from product where pid =?";
			
			try {
				PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
				pstmt.setInt(1, id);

				res = pstmt.executeUpdate();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return res;

	}

	public List<ProductBean> getAllProducts() {

		List<ProductBean> products = new ArrayList<ProductBean>();// 0//1

		Connection conn = DBConnection.getConnection();
		if (conn != null) {

			String selectSQL = "select * from product";
			try {
				PreparedStatement pstmt = conn.prepareStatement(selectSQL);
				ResultSet rs = pstmt.executeQuery();
				while (rs.next()) {

					ProductBean productBean = new ProductBean();// 1 -->values //2 -->values
					// System.out.println(rs.getInt("pid"));
					productBean.setpId(rs.getInt("pid"));
					productBean.setpName(rs.getString("pname"));
					productBean.setpPrice(rs.getInt("pprice"));
					productBean.setpQty(rs.getInt("pqty"));

					products.add(productBean);// 0//1
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return products;

	}

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
