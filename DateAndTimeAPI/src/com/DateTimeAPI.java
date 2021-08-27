package com;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI {
	public static void main(String[] args) {
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalTime time=LocalTime.now();
		System.out.println(time);
		LocalDateTime dateAndTime=LocalDateTime.now();
		System.out.println(dateAndTime);
		// set custom date
		LocalDate cd = LocalDate.of(2021,8,25);
		System.out.println(cd);
		
		// Parses the date
        LocalDate dt = LocalDate.parse("2021-08-21");
        System.out.println(dt);
  
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");
        System.out.println(formatter.format(dt));
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MMMM/YYYY");
        System.out.println(formatter1.format(dt));
        
        // date operations
        
     // Duration oneDay = Duration.between(today, yesterday); // throws an exception
        long days = Duration.between(cd.atStartOfDay(), date.atStartOfDay()).toDays(); // another option
		
		System.out.println(days);
	}

}
