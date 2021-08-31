package com;

import java.sql.Connection;
import java.sql.Statement;

public class StatementDemoV2 {

	public static void main(String[] args) {

		try {
			Connection con = DBUtils.getConnection();
			Statement stmt = con.createStatement();
			String q1 = "delete from product where id='P001'";
			int res = stmt.executeUpdate(q1);
			System.out.println(res + " rows deleted..");
		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		} finally {
			DBUtils.closeConnection();
		}

	}

}
