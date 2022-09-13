package org.simplilearn.assignments14Sep;

import java.util.Scanner;

public class ValidAgeForVote {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age of the Person");
		int Age= sc.nextInt();
		
		if(Age>=18)
		{
		System.out.println("Person is eligible for vote");
		}
		else
		{
			System.out.println("Person is  not eligible for vote");
	}}
	
	

}
