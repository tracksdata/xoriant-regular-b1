package com;

import java.util.List;
import java.util.stream.Collectors;

import com.model.Dish;
import static java.util.Comparator.comparing;
import java.time.LocalDate;

public class Ex2 {
	public static void main(String[] args) {
		
		// JDK 1.8
		
		// get low calorie dish names in asc
		
		
		List<Dish> menu=Dish.menu;
		
		menu
		.stream()
		.filter(dish->dish.getCalories()<400)
	    .sorted((d1,d2)->Integer.compare(d1.getCalories(), d2.getCalories()))
	    .map(dish->dish.getName())
		.forEach(System.out::println);
		 //System.out.println(menu);
		
		System.out.println("==============================");
		
		menu
		.stream()
		.filter(dish->dish.getCalories()<400)
		.sorted(comparing(Dish::getCalories))
		.map(Dish::getCalories)
		.forEach(System.out::println);
		
		
		
		
		System.out.println("=========================");
		List<String> dietMenu=menu
		.stream()
		.filter(dish->dish.getCalories()<400)
		.sorted(comparing(Dish::getCalories))
	    .map(Dish::getName)
		.collect(Collectors.toList());
		
		System.out.println(dietMenu);
		
	
		
		System.out.println("==================================");
		
		 List<String> filteredMenu = menu
		.stream()
		.filter(Dish::isVegettarian)
		.map(Dish::getName)
		.limit(3)
		//.forEach(System.out::println)
	    .collect(Collectors.toList());
		
	//	System.out.println(menu);
		System.out.println(filteredMenu);
		
		
		
		// sum
		
		List<Dish> totalCalaries=Dish.menu;
		
		int sum=totalCalaries
		.stream()
		.filter(Dish::isVegettarian)
		.map(dish->dish.getCalories())
		//.reduce(0,(a,b)->a+b);
		.collect(Collectors.summingInt(Integer::intValue));
		//.collect(Collectors.averagingInt(Integer::intValue));
		System.out.println(sum);
		
		
		
		
		
		int x=totalCalaries
		.stream()
		.filter(Dish::isVegettarian)
		.mapToInt(dish->dish.getCalories())
		.sum();
		//.average().orElse(0.0);
		
		System.out.println(x);
		
		
		
		
		
		
		
		
		
		/*
		
		*/
		
		
		
	}

}
