package com.class4;

public class AnnualSalary {
public static void main(String[] args) {
	
	int years=4;
	int years1=5;
	int salary=50000;
	int salary1=4999;
	
	if(years<years1) {
		System.out.println("You're eligible for the bonus");
		if (salary>salary1) {
			System.out.println(" Your bonus is 5000");
		}else {
			System.out.println("Your bonus is 3000");
		}
	}else {
		System.out.println("You're not eligible for the bonus");
	
			
		}
	}
	
	
	
}
