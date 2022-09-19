package com.girmti.javaprograms;
//Author:Paramu Kamble

import java.util.Scanner;
public class Sum_and_average_of_three_Numbers {

	public static void main(String[] args) {
//Declaration of variables and data types
		
		int a;
		int b;
		int c;
		int d;
		double e;
		
		//Creating scanner object
		
		Scanner X = new Scanner(System.in);
		
		//Input for variable a
		
		System.out.println("Enter the value of a");
		a = X.nextInt();
		
		//Input for variable b
		
		System.out.println("Enter the value of b");
		b = X.nextInt();
		
		//Input for variable c
		
		System.out.println("Enter the value of c");
		c = X.nextInt();
		
		//Sum of three numbers
		
		d = a + b + c ;
		
		//Average of three numbers
		
		e = (a + b + c)/ 3;
		
		//Printing Results
		
		System.out.println("the Sum of three numbers is "+ " " + d);
		System.out.println("The average of three numbers is"+ " " + e);
		
		
	}

}
