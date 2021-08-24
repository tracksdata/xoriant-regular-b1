package com;



public class Demo implements Runnable{
	
	public void run() { //  overridden method from Thread class
		//System.out.println(">>>>> run method by "+Thread.currentThread().getName());
		login();
		f1();
		f2();
		f3();
	}
	
	
	void login() { // individual method of Demo
		System.out.println("Login page opened to  "+Thread.currentThread().getName());
	}
	
	void f1() {
		System.out.println("f1 method by "+Thread.currentThread().getName());
	}
	
	void f2() {
		System.out.println("f2 method by "+Thread.currentThread().getName());
	}
	
	void f3() {
		System.out.println("f3 method by "+Thread.currentThread().getName());
	}
	
	
	public static void main(String[] args) {
		
	
		Demo d=new Demo();
		
		Thread t1=new Thread(d); 
		Thread t2=new Thread(d); 
		Thread t3=new Thread(d); 
		
		t1.setName("User1");
		t2.setName("User2");
		t3.setName("User3");
		
		t1.setPriority(10);
		t2.setPriority(1);
		t3.setPriority(1);
		
		
		//d.run();  
		//d.disp();
		t1.start(); //
		t2.start();
		t3.start();
		
		
		
		
	}
		
}
