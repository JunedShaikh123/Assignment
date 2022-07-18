package com.springcoreQ1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RoleTest {
	public static void main(String[] args) {
		ApplicationContext objCtx = new ClassPathXmlApplicationContext("ApplicationContextNewFile.xml");	
		  Role obj= (Role) objCtx.getBean("obja");
		  obj.show();
	}

}
