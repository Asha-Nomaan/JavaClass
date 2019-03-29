package com.class2;

public class ArithmeticOperators {

	public static void main (String[] args) {
		//declare 2 int variables and then we perform this operation
		//addition, subtraction, multiplication, division
		
		int a=30;
		int b=15;
		
		System.out.println(a+b);    //45
		System.out.println(a-b);    //15
		System.out.println(a*b);    //450
		System.out.println(a/b);    //2
		
		int sum=a+b;
		int sub=a-b;
		int mult=a*b;
		int div=a/b;
		
		System.out.println(sum);    
		System.out.println(sub);   
		System.out.println(mult);
		System.out.println(div);
		
		//print the __ of 2 numbers is__
		
		System.out.println("The sum of " + a +"and "+ b+ " is" + (a+b));
				
	}
	
}
