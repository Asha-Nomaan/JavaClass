package com.class17;

public class EvenOrOdd {
	
	public static void main(String[] args) {
		
		EvenOrOdd num=new EvenOrOdd();
		num.OddOrEven(475);
		
		
		
	}
	void OddOrEven(int num) {
		if (num%2==0) {
			System.out.println(num+" is Even");
		}else if(num%2==1) {
			System.out.println(num+" is Odd");
		}
	}

}
