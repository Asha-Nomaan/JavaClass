package com.class13;

public class StringOdd {
	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String
		 */

		String str1 = "AshaN";

		if (!str1.isEmpty()) {
			if (str1.length() % 2 == 1 && str1.length() >= 3) {
				System.out.println(str1.charAt(str1.length() / 2));
			}

		}
	}
}
