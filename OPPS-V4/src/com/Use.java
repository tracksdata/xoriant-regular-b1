package com;

abstract class Rbi {
	abstract void commonInfo();
	void copyRights() {
		
	}
}

class Sbi extends Rbi{
	
	void custInfo() {
		System.out.println(">>>> cust Info");
	}

	@Override
	void commonInfo() {
		System.out.println(">>> SBI Common Info");
		
	}
	
}

public class Use {
	public static void main(String[] args) {
		Sbi s=new Sbi();
		s.commonInfo();
		
	}

}
