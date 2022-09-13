package org.simplilearn.assignments14Sep;

import java.util.Scanner;

public class VowelOrNot {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any alphabet");
		char V= sc.next().charAt(0);
		
		
		if(V == 'a' || V == 'e' || V == 'i' || V == 'o' || V == 'u' || V == 'A' || V == 'E' || V == 'I' || V == 'O' || V == 'U')
		{
		System.out.println("The given alphabet is Vowel");
		}
		else
		{
			System.out.println("The given alphabet is Consonant");
	}}
	
	

}
