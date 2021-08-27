package com;

public class Bank implements Manager, Customer {

	@Override
	public void deposit(double amt) {
		System.out.println(">>> deposit...");
	}

	@Override
	public double withDraw(double amt) {
		System.out.println(">>> Withdrals...");
		return amt;
	}


	public void lockerAccess() {
		System.out.println(">>> Locker access granted");
	}
	
	public void cards() {
		System.out.println(">>> cards section");
	}

}
