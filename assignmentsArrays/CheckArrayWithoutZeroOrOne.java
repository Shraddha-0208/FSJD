package org.simplilearn.assignmentsArrays;
import java.util.*; 
import java.io.*; 
public class CheckArrayWithoutZeroOrOne {


	 public static void main(String[] args)
	 {
	    int[] array_nums = {50, 77, 12, 54, -11};
		System.out.println("Original Array: "+Arrays.toString(array_nums)); 
		System.out.println("Result: "+test(array_nums));
	    }	
	    public static boolean test(int[] numbers) {
	    for (int number : numbers) {
	      if (number == 0 || number == -1) {
	        return false;
	      }
	    }
	    return true;
	  }  
	}

