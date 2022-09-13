package org.simplilearn.assignments14Sep;

import java.util.Scanner;

public class AreanperimeterOfSquare {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of the square");
		int S= sc.nextInt();
		
		float A=S*S;
		System.out.println("Calculated Area of the square is: "+ A);
		float P=4*S;
		System.out.println("Calculated Perimeter of the square is: "+ P);
	}
	
	

}
