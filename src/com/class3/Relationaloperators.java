package com.class3;

public class Relationaloperators {

	public static void main(String[] args) {

		int a = 198;
		int b = 198;

		boolean result = a > b;
		boolean result1 = a == b;

		System.out.println(result);
		System.out.println(result1);

		// compare 2 numbers and if a is larger than b --> print
		if (a!= b) {
			System.out.println("Hello");
		} else {
			System.out.println("Bye");
		}
		// decakre price and if price is higher than expected price--> I will not but

		double shoesPrice = 32.99;
		double allowedPrice = 31.99;

		if (shoesPrice <= allowedPrice) {
			System.out.println("I am buying those shoes");
		}else {
			System.out.println("I am buying NOT those shoes");
		}

		System.out.println("I am conitnues code");
		System.out.println("I am conitnues code");
		System.out.println("I amd conitnues code");
	}
}
