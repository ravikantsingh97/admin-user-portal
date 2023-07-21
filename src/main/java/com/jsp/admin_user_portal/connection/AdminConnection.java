package com.jsp.admin_user_portal.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdminConnection {


	public static Connection getConnection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url = "jdbc:mysql://localhost:3306/advance-java";
			String user = "root";
			String pass = "root";

			return DriverManager.getConnection(url, user, pass);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;

	}



}
