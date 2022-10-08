package org.simplilearn.assignmentsArrays;
import java.util.Arrays;
import java.util.Collections;



public class SortInArray
{
	public static void main(String[] args) {
		
	
	int[] a= new int[5];
	
	a[0]=1789;
	a[1]=2035;
	a[2]=1899;
	a[3]=1456;
	a[4]=2013;
	System.out.println("The array list is : ");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	    
	    Arrays.sort(a);
	    System.out.println("The Sorted String representation of array  is :"+Arrays.toString(a));
	   
	
	
	}
}
	

