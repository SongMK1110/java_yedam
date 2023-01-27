package com.yedam.homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SignDAO {
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "dev";
	String pass = "dev";

	Connection conn;
	Statement stmt = null;
	PreparedStatement psmt = null;
	ResultSet rs = null;
	String sql;

	public void connect() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("에러발생.");
			e.printStackTrace();
		}
	}

	// 로그인
	public List<SignVO> LoginVOLogin() {
		connect();
		sql = "select * from sign";
		List<SignVO> list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				SignVO login = new SignVO();
				login.setId(rs.getString("id"));
				login.setPassword(rs.getString("password"));

				list.add(login);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return list;
	}

	// 회원가입
	public int addSign(SignVO sign) {
		connect();
		sql = "insert into sign (id, password, tel, email) values(?, ?, ?, ?)";
		int r = 0;
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, sign.getId());
			psmt.setString(2, sign.getPassword());
			psmt.setString(3, sign.getTel());
			psmt.setString(4, sign.getEmail());

			r = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return r;
	}
}
