package com.model;

import java.util.Arrays;
import java.util.List;

public class Dish {

	private String name;
	private boolean vegettarian;
	private int calories;
	
	private Type type;

	public Dish() {
		// TODO Auto-generated constructor stub
	}

	public Dish(String name, boolean vegettarian, int calories, Type type) {
		super();
		this.name = name;
		this.vegettarian = vegettarian;
		this.calories = calories;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isVegettarian() {
		return vegettarian;
	}

	public void setVegettarian(boolean vegettarian) {
		this.vegettarian = vegettarian;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	
	public enum Type {
		MEAT, FISH, OTHER
	}

	@Override
	public String toString() {
		return name +" "+calories;
	}
	
	public static final List<Dish> menu=Arrays.asList(
			new Dish("chilcken", false, 800, Dish.Type.MEAT),
			new Dish("mutton", false, 700, Dish.Type.MEAT),
			new Dish("french fries", true, 150, Dish.Type.OTHER),
			new Dish("rice", true, 350, Dish.Type.OTHER),
			new Dish("pizza", true, 1000, Dish.Type.OTHER),
			new Dish("fruits", true, 120, Dish.Type.OTHER),
			new Dish("chicken biryani", false, 300, Dish.Type.OTHER),
			new Dish("chilli fish", false, 340, Dish.Type.FISH)		
			
	);
	
	

}
