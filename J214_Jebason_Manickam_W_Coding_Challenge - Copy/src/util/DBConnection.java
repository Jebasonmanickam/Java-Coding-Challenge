package util;


import java.sql.*;

public class DBConnection {
	static Connection connection;

	public static Connection getDBConnection() {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/javacoding", "root", "JeBaZ_03#");

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
		
	}

	public static void main(String args[]) {
		System.out.println(getDBConnection());
	}

}