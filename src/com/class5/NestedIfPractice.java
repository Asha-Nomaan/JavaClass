package com.class5;

public class NestedIfPractice {

	public static void main(String[] args) {
		/*
		 * check if user has credit car--> check what is the balance if balance is more
		 * than 1000--> pay off else "you are good"
		 * 
		 */

		boolean creditCard = true;
		int balance = 900;

		if (creditCard) {
			System.out.println("Let's check the balance");
			if (balance >= 1000) {
				System.out.println("Pay off now");
			} else {
				System.out.println("you are safe");
			}

		} else {
			System.out.println("Do you want a credit card?");
		}

	}

}
