package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection con;
	public static Connection getDBConn(){
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javacoding","root","JeBaZ_03#");
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		return con;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getDBConn());
	}

}
