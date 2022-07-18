package com.springcoreQ5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcoreQ3.EMI;

public class MaxTest {
public static void main(String[] args) {
		
		ApplicationContext contex=new ClassPathXmlApplicationContext("ApplicationContextNewFile.xml");
		Max max=(Max)contex.getBean("max1");
		
		max.show();
		max.maxNum();
		
	}

}
