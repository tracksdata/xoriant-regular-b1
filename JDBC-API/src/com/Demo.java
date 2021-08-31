package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class Demo {
	
	public static void main(String[] args) {
		
		// 1. load driver class
		// 2 ways . 
		// old one
		try {
			// way 1
			//DriverManager.registerDriver(new Driver());
			// way 2 
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println(">> Driver class is loaded...");
			
			// 2. get connection
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root1234");
			System.out.println(">> Connection established...");
			
			
		} catch (Exception e) {
			System.out.println("failed due to "+e);
		}
		
	}

}
