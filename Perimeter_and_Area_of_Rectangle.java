package com.girmti.javaprograms;
// Author:Paramu Kamble

import java.util.Scanner;
public class Perimeter_and_Area_of_Rectangle {

	public static void main(String[] args) {
//Declaration of variables
		
		double length;
		double width;
		double area;
		double perimeter;
		
		//Creating Scanner class object
		
		Scanner P = new Scanner(System.in);
		
		//Input for length of Rectangle
		
		System.out.println("Enter the Length of the Rectangle");
		length = P.nextDouble();
		
		//Input for  width of the Rectangle
		
		System.out.println("Enter the Width of the Rectangle ");
		width = P.nextDouble();
		
		//Calculating Area of Rectangle
		
		area = length*width;
		
		//Calculating Perimeter of Rectangle
		
		perimeter = 2*(length + width);
		
		//Print the perimeter of Rectangle
		
		System.out.println("Perimeter of Rectangle is" + " " + perimeter + "units");
		
		//Print the area of Rectangle
		
		System.out.println("Area of Rectangle"+ " "+ area + "Sq.units");
		


	}

}
