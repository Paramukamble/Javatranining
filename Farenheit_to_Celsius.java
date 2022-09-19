package com.girmti.javaprograms;
//Author:Paramu Kamble

import java.util.Scanner;
public class Farenheit_to_Celsius {

	public static void main(String[] args) {
		
//Formula to convert Celsius to Farenheit is C= (F-32)*(9/5)
		
		//Declaration of variables and data types
		
		double C;
		double F;
		
		/*Creating scanning class object*/
		
		Scanner U = new Scanner(System.in);
		
		/*input for F  Using Scanner methods*/
		
		System.out.println("Enter the Farenheit value to convert");
		F = U.nextDouble();
		
		//Converting Farenheit to celsius
		
		C = (F-32)*(9f/5);// 9f is used for converting integer division in to float division
		
		/*Printing Results*/
		
		System.out.println("The Conversion value of farenheit is to be "+ " "+ C + "degree celcius");
	}

}
