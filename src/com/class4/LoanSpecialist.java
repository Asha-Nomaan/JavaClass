package com.class4;

import java.util.Scanner;

public class LoanSpecialist {
private static Scanner sc;

public static void main(String[] args) {
	
	int loan;
	
			
	sc = new Scanner(System.in);
	
	System.out.println("What is the amount of loan needed?");
	
	loan=sc.nextInt();
	
	if(loan<200000) {
		System.out.println("I will loan you the money");
	}else {
		System.out.println("I reject it");
	}
	
	
}

}

