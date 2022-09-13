package org.simplilearn.assignments14Sep;

import java.util.Scanner;

public class TemperatureConvertor {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Temperature in celsius:");
		float C= sc.nextFloat();
		
		float F=((C*9)/5)+32;
		System.out.println("Calculated Temperature in Fahrenheit is: "+ F);
	}
	
	

}
