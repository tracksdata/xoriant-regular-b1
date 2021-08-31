package com;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class PreparedStatementDemoV3 {

	public static void main(String[] args) {
		System.out.println(">>> Inserting :: PreparedStatement");
		try {
			long st, et;
			st = System.currentTimeMillis();
			Connection con = DBUtils.getConnection();
		 
			String q1 = null;
			PreparedStatement ps=null;
			q1 = "insert into s1 values(?)";
			ps=con.prepareStatement(q1);

			for (int i = 1; i <= 50000; i++) {
				ps.setInt(1, i);
				ps.executeUpdate();
			}
			et = System.currentTimeMillis();
			System.out.println("Total Time: " + (et - st));
		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		} finally {
			DBUtils.closeConnection();
		}

	}

}
