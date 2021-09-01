package com;

import java.sql.Connection;
import java.sql.Statement;

public class BatchUpdateDemo {

	public static void main(String[] args) {

		try {
			Connection con = DBUtils.getConnection();
			
			String q1 = "update product set name= 'P1111' where id='P002'";
			String q2 = "update product set name= 'P2222' where id='P003'";
			String q3 = "insert into product values('P001','USB',876,'256GB')";

			Statement stmt = con.createStatement();
			
			stmt.addBatch(q1); // 0th index
			stmt.addBatch(q2); // 1st index
			stmt.addBatch(q3); // 2nd index


			int[] results = stmt.executeBatch();

			int count = 0;

			for (int i = 0; i < results.length; i++) {
				if (results[i] == 1) {
					count++;
				}
			}

			System.out.println(count + " statements executed successfully..");

			
		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		} finally {
			DBUtils.closeConnection();
		}

	}

}
