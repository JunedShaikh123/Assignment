package com.springcoreQ8;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Itm {

	List <Integer> itm;
	
	public List <Integer>getItm(){
		return itm;
		
	}
	
	public void setItm(List <Integer> itm) {
		this.itm= itm;
	}
	public void show() {
		System.out.println(this.itm);
	}
	
	public void asc() {
		itm.stream().sorted().forEach(System.out::println);
	}
	public void dsc() {
			itm.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
	
	public void duplicate () {
		Set rmv =(Set) itm.stream().collect(Collectors.toSet());
		System.out.println(rmv);
	}
}
