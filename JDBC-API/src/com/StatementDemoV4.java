package com;

import java.sql.Connection;
import java.sql.Statement;

public class StatementDemoV4 {

	public static void main(String[] args) {

		System.out.println("Inserting::: Statement");
		try {
			long st, et;
			st = System.currentTimeMillis();
			Connection con = DBUtils.getConnection();
			Statement stmt = con.createStatement();
			String q1 = null;

			for (int i = 1; i <= 50000; i++) {
				q1 = "insert into s1 values(" + i + ")";
				stmt.executeUpdate(q1);
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
