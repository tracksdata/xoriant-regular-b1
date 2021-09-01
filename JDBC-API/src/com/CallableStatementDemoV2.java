package com;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.Types;


public class CallableStatementDemoV2 {

	public static void main(String[] args) {

		try {
			Connection con = DBUtils.getConnection();
			
			CallableStatement cs = con.prepareCall("{call  cart_price(?)}");
			
			
			cs.registerOutParameter(1, Types.INTEGER);
			cs.execute();
			int totalPrice = cs.getInt(1);
			
			System.out.println("Total in Cart: "+totalPrice);
			
			System.out.println(">>>> Procedure executed...");

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		} finally {
			DBUtils.closeConnection();
		}

	}

}
