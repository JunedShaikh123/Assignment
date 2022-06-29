package com.AvgDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AvgPrice6 {
	public static void main(String[] args) {
		List<Item> ilist= new ArrayList<Item>();
		ilist.add(new Item(1,"Pen",1200f));
		ilist.add(new Item(1,"Pencil",1500f));
		ilist.add(new Item(1,"T.V",9000f));
		Double avg= ilist.stream().collect(Collectors.averagingDouble(e->e.itemprice));
		System.out.println("Average number is "+avg);
		System.out.println("------");
		
		
		
		
	
	}
	
	

}
