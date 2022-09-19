package com.girmti.javaprograms;
//Author:Paramu Kamble

import java.util.Scanner;
public class Valume_of_cube {

	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
	      System.out.println("Enter the side of the cube:");
	      double side= s.nextDouble();
	      double Volume= side*side*side;
	    System.out.println("Volume of the cube:"+ Volume);

	}

}
