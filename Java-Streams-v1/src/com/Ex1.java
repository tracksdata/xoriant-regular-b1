package com;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.model.Dish;

public class Ex1 {

	public static void main(String[] args) {
		
		// JDK 1.7
		// get low calories dish in asc
		List<Dish> menu=Dish.menu;
		
		
		// step-1
		List<Dish> lowCalorieDishwes=new ArrayList<>();
		
		for(Dish dish:menu) {
			if(dish.getCalories()<400)
				lowCalorieDishwes.add(dish);
		}
		
		
		// step-2
		lowCalorieDishwes.sort(new Comparator<Dish>() {
			public int compare(Dish d1, Dish d2) {
				return Integer.compare(d1.getCalories(), d2.getCalories());
			};
		});
		
		
		System.out.println(lowCalorieDishwes);
		
		
		// step-3
		
		List<String> lowCaloriiDishNames=new ArrayList<>();
		
		for(Dish dish:lowCalorieDishwes) {
			lowCaloriiDishNames.add(dish.getName());
		}
		
		// step-4
		for(String name:lowCaloriiDishNames) {
			System.out.println(name);
		}
		
		

	}

}
