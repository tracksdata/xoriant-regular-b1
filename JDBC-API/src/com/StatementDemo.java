package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {
	
	public static void main(String[] args) {
		
		Connection con=null;
		
		try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root1234");
		Statement stmt=con.createStatement();
		String q1="insert into product values('P002','Book',322,'Java')";
		
		int res=stmt.executeUpdate(q1);
		System.out.println(res+" rows inserted...");
			
		} catch (Exception e) {
			System.out.println("failed due to "+e);
		}finally {
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

}
