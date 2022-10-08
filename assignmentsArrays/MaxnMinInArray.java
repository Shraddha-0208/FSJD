package org.simplilearn.assignmentsArrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class MaxnMinInArray
{
	public static void main(String[] args) {
	
	int[] a= new int[7];
	int max=a[0];
	int min=a[0];
	
	a[0]=53;
	a[1]=32;
	a[2]=19;
	a[3]=79;
	a[4]=25;
	a[5]=5;
	a[6]=47;
	
	System.out.println("The array list is : ");
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
	for(int i=0;i<a.length;i++)
	{	 
	if(a[i]>max)
	   {
		   max=a[i];
		   
	   }
	
	if(a[i]<min)
	   {
		   min=a[i];
	   }
	}
		System.out.println("The maximum value in array  is :"+ max);
	    System.out.println("The minimum value in array  is :"+ min);
	
	  
	   }
	}

	

