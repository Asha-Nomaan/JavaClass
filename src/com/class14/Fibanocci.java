package com.class14;

/*
 * write a java program to print first 10 numbers of Fibonacci series
 */
public class Fibanocci {
	public static void main(String[] args) {

		int a = 1;
		int b = 0;
		int c = 0;

		for (int i = 0; i < 10; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(a + " ");
		}
	}
}
