package com;

import java.sql.Connection;
import java.sql.Statement;

public class Transactions {
	
	

	public static void main(String[] args) {

		try {
			Connection con = DBUtils.getConnection();
			con.setAutoCommit(false);
			String q1 = "update product set name= 'B111' where id='P002'";
			String q3 = "insert into product values('P008','Charger',433,'Sony')";
			String q2 = "update product set name= 'B222' where id='P003'";

			Statement stmt = con.createStatement();
			
			stmt.addBatch(q1); // 0th index
			stmt.addBatch(q3); // 1st index
			stmt.addBatch(q2); // 2nd index


			int[] results = stmt.executeBatch();

			int count = 0;
			
			boolean flag=true; // first time

			for (int i = 0; i < results.length; i++) {
				if (results[i] == 1) {
					count++;
				}
				if(results[i]==0) {
					flag=false;
				}
			}
			
			if(flag) {
				con.commit();
			}else {
				con.rollback();
				System.out.println("Few Statements failed to execute");
			}

			System.out.println(count + " statements executed successfully..");

			
		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		} finally {
			DBUtils.closeConnection();
		}

	}

}
