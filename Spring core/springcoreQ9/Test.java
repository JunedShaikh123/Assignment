package com.springcoreQ9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		List<City> clist = new ArrayList<City>();
		Scanner sc = new Scanner(System.in);
		
		ApplicationContext objCtx = new ClassPathXmlApplicationContext("ApplicationContextNewFile.xml");	
		
		City ct1 = (City) objCtx.getBean("city1");
		City ct2 = (City) objCtx.getBean("city2");
		City ct3 = (City) objCtx.getBean("city3");
		City ct4 = (City) objCtx.getBean("city4");

		clist.add(ct1);
		clist.add(ct2);
		clist.add(ct3);
		clist.add(ct4);

		System.out.println("enter from city name");
		String fromCity1 = sc.next();

		System.out.println("enter to city name");
		String toCity1 = sc.next();

		List<City> matchedList = clist.stream().filter(c -> c.getFromCity().equalsIgnoreCase(fromCity1))
				.filter(c -> c.getToCity().equalsIgnoreCase(toCity1)).collect(Collectors.toList());

		if (!matchedList.isEmpty()) {
			for (City cities : matchedList) {
				System.out.print("distance between "+cities.getFromCity() +" & "+cities.getToCity()+" is "+cities.getDistance() + " Km");

			}
		} else
			System.out.println("data not available");
	}
}
