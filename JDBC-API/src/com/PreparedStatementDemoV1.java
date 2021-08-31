package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementDemoV1 {

	public static void main(String[] args) {
		System.out.println(">>> Inserting :: PreparedStatement");

		try {
			Connection con = DBUtils.getConnection();
			//Statement stmt = con.createStatement();
			String q1="insert into product values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(q1);
			ps.setString(1, "P003");
			ps.setString(2, "Mobile");
			ps.setFloat(3, 45000);
			ps.setString(4, "Samsung A7");
			
			int res=ps.executeUpdate();
			System.out.println(res+" rows saved....");
			
			
			//String q1 = "update product set name='laptop',price=56000,description='Dell' where id='P002'";
			//int res = stmt.executeUpdate(q1);
			//System.out.println(res + " rows updated..");
		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		} finally {
			DBUtils.closeConnection();
		}

	}

}
