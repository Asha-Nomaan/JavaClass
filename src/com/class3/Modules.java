package com.class3;

public class Modules {

	public static void main(String[] args) {

		int a=10;
		int b=3;
		int div=a/b;
		
		System.out.println(div);//3
		
		//modulus operator
		
		int mod=a%b;
		System.out.println(mod);
		
		int q=101;
		int w=10;
		
		System.out.println(q%w);
		//Parentheses, Exponents, Multiplication/Division, Addition/Subtraction
		int e=-5+4*6;
		System.out.println(e);//19
		
		int x=(22+9) % 7;
		System.out.println(x);//3
		
		int y= 20 + -3*5 / 8;
		System.out.println(y);//19
		
		int z= 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println(z);//13

	}

}
