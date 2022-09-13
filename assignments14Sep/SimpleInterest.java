package org.simplilearn.assignments14Sep;

import java.util.Scanner;

public class SimpleInterest {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principle Amount");
		float P= sc.nextFloat();
		System.out.println("Enter Rate Amount");
		float R= sc.nextFloat();
		System.out.println("Enter Years Amount");
		float T= sc.nextFloat();
		float SI=(P*R*T)/100;
		System.out.println("Calculated Simple Interest is: "+ SI);
	}
	
	

}
