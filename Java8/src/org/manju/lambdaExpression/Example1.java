package org.manju.lambdaExpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example1 {

	public static void main(String[] args) {
		//method with no parameters
		MyfunctionalInterface msg= () -> {
			return "Hello";
		};
		System.out.println(msg.sayHello());
	//method with single parameters
	MyfunctionalInterface2 msg2=(num) -> num+5;
	 System.out.println(msg2.incrementByFive(22));
	//method with multiple parameters
	MyfunctionalInterface3 con = (str1,str2) -> str1+str2;
	System.out.println("Result : " + con.concat("Manjunath ","Pai"));
	System.out.println();
	
	//use of foreach loop
	List<String> list = new ArrayList<String>();
	list.add("I");
	list.add("am");
	list.add("learning");
	list.add("JAVA 8");
	list.add(":)");
	//lambda expresiion
	list.forEach(
			(names) -> System.out.println(names)
			);
	
	//use of foreach loop to iterate over a map
	Map<String, Integer> prices=new HashMap<String, Integer>();
	prices.put("Apple", 50);
	prices.put("Orange", 20);
	prices.put("Banana", 10);
	prices.put("Grapes", 40);
	
	prices.forEach(
			(key, value) -> System.out.println("Fruit : " + key + " Price : " + value)
			);
	
	
	}//end of main
}
