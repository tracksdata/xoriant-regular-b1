package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetDemo {
	
	public static void main(String[] args) {
		
		try {
			
			Connection con=DBUtils.getConnection();
			String q1="select * from product";
			
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery(q1);
			
			//rs.next();
			
			/*
			System.out.println(rs.getString("id"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getFloat("price"));
			System.out.println(rs.getString("description"));
			*/
			
			while(rs.next()) {
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getFloat("price"));
				System.out.println(rs.getString("description"));
				System.out.println("----------------------------");
			}
			
			/*
			 * Notes
			 * -------------
			 * => Types of resultset Sensitive: 2 types
			 * 		1. FordwarrdOnly Resultset
			 * 		2. Scrollable Resultset
			 * 
			 *     
			 * 
			 */
			
		
			
			
			
			
		} catch (Exception e) {
			System.out.println("failed due to "+e);
		}finally {
			DBUtils.closeConnection();
		}
		
		
	}

}
