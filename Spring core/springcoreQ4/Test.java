package com.springcoreQ4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContextNewFile.xml");
		Employee emp=(Employee) context.getBean("emp1");
		emp.showEmp();
		
		
	
	
}
}