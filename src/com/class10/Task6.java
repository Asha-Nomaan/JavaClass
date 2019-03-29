package com.class10;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		
		Scanner scan;
		int year;
		
		scan=new Scanner(System.in);
		
		for (int i=0; i<=10; i++) { 
			
			System.out.println("Please enter a guessed leap year");
			year=scan.nextInt();
			
			if (year%4==0) {
				System.out.println("The year is a leap year");
				break;
			}else {
				System.out.println("The year is a leap year");
			}
		}

	}

}
