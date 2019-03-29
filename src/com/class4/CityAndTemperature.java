package com.class4;

import java.util.Scanner;

public class CityAndTemperature {
private static Scanner myScanner;

	/*
 *  Ask user to enter city and temperature in Farenheit
 *  Your program should convert F-->C
 *  Your program should say "The temperature in the city__is __"
 */
	public static void main(String[] args) {
		String cityName;
		int temp;
		
		myScanner = new Scanner(System.in);
		
		System.out.println("Please enter your city");
		
		cityName=myScanner.nextLine();
		System.out.println("Please enter temperature in Farenhiet");
		
		temp=myScanner.nextInt();
		//formula (F -32) x 5/9;
		
		int convertedTemp=(temp-32)*5/9;
		System.out.println("the temperature in the city "+cityName+" is "+convertedTemp+" C ");
		
		;
		
	}
	
}
