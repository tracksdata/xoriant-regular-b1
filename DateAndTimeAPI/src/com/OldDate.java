package com;

import java.util.Calendar;
import java.util.Date;

public class OldDate {
	
	public static void main(String[] args) {
		
		
		Date d=new Date();
		System.out.println(d);
		System.out.println(d.getMonth()+1); //  deprecated
		
		// Calendar
		
		Calendar cl=Calendar.getInstance();
		System.out.println(cl.getTime());
		cl.get(Calendar.MONTH);
		
	}

}
