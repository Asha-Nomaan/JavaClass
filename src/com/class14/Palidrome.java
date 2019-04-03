package com.class14;

import java.util.Scanner;

public class Palidrome {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter any word to check if its a palidrome!");
		String word = scan.nextLine();

		String reverse = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			reverse += word.charAt(i);
		}
		if (word.equalsIgnoreCase(reverse)) {
			System.out.println("The word is palidrome ");
		} else {
			System.out.println("The word isn't a plaidrome");
		}
	}
}
