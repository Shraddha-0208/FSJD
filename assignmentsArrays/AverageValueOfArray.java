package org.simplilearn.assignmentsArrays;

public class AverageValueOfArray {
	public static void main(String[] args) {
		
		int sum=0;
		double avg;
		
		int[] a= new int[5];
		
		a[0]=3;
		a[1]=4;
		a[2]=5;
		a[3]=7;
		a[4]=9;
		
		System.out.println("The array list is : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			sum= sum +a[i];
			
			}
		System.out.println("Sum of array is: " + sum );
		avg=sum/a.length;
		
		System.out.println("Average of array is: " + avg );
		
}}
