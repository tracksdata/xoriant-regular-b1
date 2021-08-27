package com;

public class Use {
	
	public static void main(String[] args) {
		
		// V1
		/*
		Bank b=new Bank();
		b.deposit(1000);
		b.withDraw(500);
		b.lockerAccess();
		*/
	//------------------
		
		Customer cust=new Bank();
		cust.deposit(1000);
		cust.withDraw(100);
		
		Manager m=new Bank();
		m.lockerAccess();
		
		
		
		
	}

}
