package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	private static Connection con=null;
	
	public static Connection getConnection() {
		if(con!=null) {
			return con;
		}
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root1234");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	static public  void closeConnection() {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
