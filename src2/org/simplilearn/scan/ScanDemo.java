package org.simplilearn.scan;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter any two numbers");
			System.out.println("Enter first number");
			int n1 = sc.nextInt();
			System.out.println("Enter second number");
			int n2 = sc.nextInt();

			System.out.println("Enter any operator : + - * / ");
			String operator = sc.next();
			char c = operator.charAt(0);
			if (c == '+')
				System.out.println("Addition" + (n1 + n2));
			else if (c == '-')
				System.out.println("Subtraction " + (n1 - n2));
			else if (c == '*')
				System.out.println("Multiplication " + (n1 * n2));
			else if (c == '/')
				System.out.println("Division " + (n1 / n2));
			else
				System.out.println("Select proper operator");
			
			System.out.println("Enter y to continue and n to exit");
			char input= sc.next().charAt(0);
			if(input=='y' || input == 'Y')
				continue;
			else
				System.out.println("Thank you for using calculator");
				break;
		}
	}
}
