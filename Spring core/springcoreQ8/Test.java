package com.springcoreQ8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {
	
		public static void main(String[] args) {
			ApplicationContext objCtx = new ClassPathXmlApplicationContext("ApplicationContextNewFile.xml");	
			  Itm obj= (Itm) objCtx.getBean("que8");
			
			  obj.dsc();
			  System.out.println("-----");
			  obj.asc();
			  System.out.println("-----");
			obj.duplicate();
			  

}
}