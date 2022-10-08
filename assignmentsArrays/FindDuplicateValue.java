package org.simplilearn.assignmentsArrays;
import java.util.Arrays;
import java.util.Collections;



public class FindDuplicateValue
{
	public static void main(String[] args) {
		
	
	int[] a= new int[5];
	
	a[0]=5;
	a[1]=2;
	a[2]=7;
	a[3]=7;
	a[4]=5;
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
			if(a[i]==a[j])
		
		
		System.out.println("The duplicate elements in array is "+ a[j]);
	}
	}
	    
	   
	
	}
}
	

