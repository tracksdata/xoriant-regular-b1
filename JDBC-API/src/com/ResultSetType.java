package com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetType {
	
	public static void main(String[] args) {
		
		try {
			
			Connection con=DBUtils.getConnection();
			String q1="select * from product";
			
			//Statement st=con.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE);
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);

			ResultSet rs= st.executeQuery(q1);
			
			rs.absolute(1);
			rs.updateString(2, "New Product-V2");
			rs.updateRow();
			
			//rs.
			//rs.refreshRow();
			
			//(rs.next()) {
				System.out.println(rs.getString("id"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getFloat("price"));
				System.out.println(rs.getString("description"));
				System.out.println("----------------------------");
			//}
			
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
