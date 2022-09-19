package com.girmti.javaprograms;
/*
 * Author:Paramu Kamble
 */
import java.util.Scanner;
public class Area_of_circle {

	public static void main(String[] args) {
//Declaration of variables and data types
		
		double PI = 3.142;
		double r;
		double area;
		
		//Creating Scanner object
		
		Scanner S = new Scanner(System.in);
		
		//Input for r
		
		System.out.println("Enter Radius r of Circle ");
		r = S.nextDouble();
		
		//Finding Area of circle
		
		area = PI * r * r;
		
		//Printing the Results
		
		System.out.println("The area of circle is "  + " "+ area);
		
		
		
		
	}

}
