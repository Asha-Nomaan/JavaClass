package com.class14;

public class TwoNumbers {
	/*Write a program to swap 2 numbers without a temporary variabale? 
	 * Swap 2 strings without a temporary variable?
	 * */
	 
public static void main(String[] args) {

		int a=10;
		 int b=25;
		 
		 
		System.out.println("Before: int a= "+a+" int b= "+b);
		
		a=a+b; //30
		b=a-b; //30-20=10
		a=a-b; //30-10=20
		
		System.out.println("After: int a= "+a+" int b= "+b);
		
		System.out.println("---Strings---");
		
		String str1="Sunny";
		String str2="Windy";
		System.out.println("Before: str1= "+str1+"  str2= "+str2);
		
		str1=str1+str2;
		
		str2 = str2.substring(0, str1.length()-str2.length());
        str1=str1.substring(str2.length());
        System.out.println("After swapping string str1= "+str1+" string str2 = "+str2);
		
		
		
		
	
		
		 
		 
	
}
}
