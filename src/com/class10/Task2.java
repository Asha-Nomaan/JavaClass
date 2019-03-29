package com.class10;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scan;
		String item;
		double price;
		double payment;
		double totalPayment=0;
		double balance;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your item");
		item=scan.nextLine();
		
		System.out.println("Please enter the item price");
		price=scan.nextDouble();
		
		do {
			System.out.println("Please enter your payment amount");
			payment=scan.nextDouble();
			
			totalPayment=totalPayment+payment;
			balance=price-totalPayment;
			System.out.println("Pleasae enter more $"+balance);
			
		}while(totalPayment!=price);
		System.out.println("Thank you for shopping");
	}

}
