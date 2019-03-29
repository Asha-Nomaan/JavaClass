package com.class8;

import java.util.Scanner;

public class Soda {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        double amount;
        do {
        System.out.println("Please pay for your soda");
        amount = scan.nextDouble();
        }
        while (amount!=1.99);
        System.out.println("Please enjoy your soda");

}

	}

