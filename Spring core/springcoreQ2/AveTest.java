package com.springcoreQ2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class AveTest {

	
	public static void main(String[] args) {
		

		ApplicationContext co=new ClassPathXmlApplicationContext("ApplicationContextNewFile.xml");
		
		AveNum avg=(AveNum)co.getBean("ave");
		avg.show();
		
		
		
	}
}