package com.springcoreQ3;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcoreQ1.Role;

public class Test {
	public static void main(String[] args) {
		ApplicationContext objCtx = new ClassPathXmlApplicationContext("ApplicationContextNewFile.xml");	
		  EMI obj= (EMI) objCtx.getBean("que3");
		  System.out.println("Interest rate "+obj.rate +"%");
		  
		  Scanner sc = new Scanner (System.in);
		  System.out.println("enter Amount");
		  float amount = sc.nextFloat();
		  
		  System.out.println("Enter validity in years ");
		  int validity = sc.nextInt();
		  int validityinmonths= validity*12;
		  
		  Double TPA= amount+((amount*obj.rate)/100)*validity;
		  System.out.println("total Payable amount "+TPA);
		  
		  
		  Double emi= TPA/validityinmonths;
		  System.out.println("EMI for total amount ");
		  
	}

}
