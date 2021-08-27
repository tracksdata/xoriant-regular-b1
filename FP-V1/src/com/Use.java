package com;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Use {

	public static void main(String[] args) {
		
		Product p1=new Product(10,"Pen", 157, "Red Ink");
		Product p2=new Product(11,"Book", 456, "Java");
		Product p3=new Product(12,"Laptop", 233, "Sony Play Toy");
		Product p4=new Product(14,"Mobile", 122, "Samsung");
		Product p5=new Product(15,"Usb", 1500, "256 GB 3.2");
		
		List<Product> prods=Arrays.asList(p1,p2,p3,p4,p5);
		
		// Using anonymous class
        Predicate<Integer> predicate=new Predicate<Integer>() {
 
            @Override
            public boolean test(Integer i) {
                return i > 100;
            }
        };
        
        // v2
     // Using lambda expression
        Predicate<Integer> predicate1 = (i) -> i > 100;
 
        System.out.println(predicate.test(670));
        System.out.println(predicate1.test(56));
        
        
        prods.forEach(product->{
        	Predicate< Product> predicate2=(price)->product.getPrice()>=1000;
        	System.out.println(predicate2.test(product));
        });
        
        
        
        
		
		
		
		
		
		

	}

}
