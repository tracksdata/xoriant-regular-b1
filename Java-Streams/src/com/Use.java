package com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Use {

	public static void main(String[] args) {
		
		Product p1=new Product(10,"Pen", 157, "Red Ink");
		Product p2=new Product(11,"Book", 670, "Java");
		Product p3=new Product(12,"Laptop", 233, "Sony Play Toy");
		Product p4=new Product(14,"Mobile", 122, "Samsung");
		Product p5=new Product(15,"Usb", 1500, "256 GB 3.2");
		
		List<Product> prods=Arrays.asList(p1,p2,p3,p4,p5); // 
		
		
		// Stream API
		//----------------------
		/*
		 * -> forEach
		 * -> filter
		 * -> map
		 * -> reducer
		 * 
		 */
		
		// Stream<Product> streamObj = prods.stream();
		// streamObj.findFirst();
		
		// only for iteration
		prods.forEach(prod->{
			System.out.println(prod);
		});
		
		
		
		System.out.println("=============================");
		
		// can apply stream api methods
		prods.stream().forEach(prod->{
			System.out.println(prod);
		});
		
		System.out.println("=============================");
		
		Stream<Product> res1 = prods.stream().filter(prod->prod.getPrice()>=500);
		Stream<Product> res2 = prods.stream().filter(prod->prod.getPrice()<=500);
		// apply filter on stream, and convert filtered data info java.util.List
		//List<Product> res3 = prods.stream().filter(prod->prod.getPrice()>=500 && prod.getPrice()<=1000).collect(Collectors.toList());
		List<Product> res3 = prods.stream()
				.filter(prod->prod.getPrice()>=500 && prod.getPrice()<=1000)
				.collect(Collectors.toList());
		
		
		

		
		res1.forEach(System.out::print);
	
		/*res1.forEach(prod->{
			System.out.println(prod);
		});*/
		
		System.out.println("===============================");
		res2.forEach(prod->{
			System.out.println(prod);
		});
		
		
		System.out.println("===============================");
		res3.forEach(prod->{
			System.out.println(prod);
		});
		
		System.out.println("===============================");
		
		
		
		
		
		
        
		
		
		
		
		
		

	}

}
