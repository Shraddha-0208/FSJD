package org.simplilearn.assignmentsArrays;
import java.util.Arrays;
import java.util.Collections;



public class SumOfPairElements
{
	public static void main(String[] args) {
		
	
	int[] a= new int[7];
	
	a[0]=2;
	a[1]=7;
	a[2]=4;
	a[3]=-5;
	a[4]=11;
	a[5]=5;
	a[6]=20;
	
	int sum=15;
	System.out.println("The array list is : ");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	//Search for Duplicate element in Array
	
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]+a[j]== sum)
		
		
		System.out.println("The elements whose sum is 15 are: "+ a[i] + " and " + a[j]);
	}
	}
	    
	   
	
	}
}
	

