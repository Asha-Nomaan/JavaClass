package com.class4;

public class MortgageRate {
public static void main(String[] args) {
	
	double rate=4.4;
	double rate1=4.5;
	int price=200000;
	int price1=199999;
	if (rate>rate1) {
		System.out.println("I will not buy the house");
	}else {
		System.out.println("I will buy the house");
		if (price<price1) {
			System.out.println("I will take a loan");
		}else {
			System.out.println("I will pay cash");
		}
	}
}
}
