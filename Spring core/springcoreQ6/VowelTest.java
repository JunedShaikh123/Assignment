package com.springcoreQ6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcoreQ1.Role;

public class VowelTest {
public static void main(String[] args) {
	
	ApplicationContext objCtx = new ClassPathXmlApplicationContext("ApplicationContextNewFile.xml");	
	  Vowel obj= (Vowel) objCtx.getBean("vowl");
}
}
