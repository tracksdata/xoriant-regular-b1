package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Types;


public class CallableStatementDemo {

	public static void main(String[] args) {

		try {
			Connection con = DBUtils.getConnection();
			
			CallableStatement cs = con.prepareCall("{call new_author(?, ?)}");
			//cs.registerOutParameter(0, Types.INTEGER);
			cs.setString(1, "Praveen");
			cs.setString(2, "abc@abc.com");
			
			cs.execute();
			System.out.println(">>>> Procedure executed...");

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		} finally {
			DBUtils.closeConnection();
		}

	}

}
