package com.springcoreQ1;

public class Role {
	private Role() {
		
	}
public static Role getObjA() {
	return new Role();
	
}
public void show() {
	System.out.println("Object is created");
}
}
