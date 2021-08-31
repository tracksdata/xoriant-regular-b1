package com;

import java.sql.Connection;
import java.sql.Statement;

public class StatementDemoV1 {

	public static void main(String[] args) {

		try {
			Connection con = DBUtils.getConnection();
			Statement stmt = con.createStatement();
			String q1 = "update product set name='laptop',price=56000,description='Dell' where id='P002'";
			int res = stmt.executeUpdate(q1);
			System.out.println(res + " rows updated..");
		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		} finally {
			DBUtils.closeConnection();
		}

	}

}
