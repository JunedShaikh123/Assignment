package Assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AverageMarks1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of Subject");
		List <Integer> list =new ArrayList<Integer>();
		
		for(int i=0;i<=5;i++) {
			int c =sc.nextInt();
			list.add(c);
		}
		for(int d:list) {
			System.out.println(d);
		}
		Double avgvalue=list.stream().collect(Collectors.averagingDouble(e->e));		
		System.out.println("average value is = "+avgvalue);
	}
}

