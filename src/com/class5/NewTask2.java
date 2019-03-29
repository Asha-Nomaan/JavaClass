package com.class5;

import java.util.Scanner;

public class NewTask2 {

	public static void main(String[] args) {
		
		int n1;
		int n2;
		int n3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1");
		n1 = sc.nextInt();
		
		System.out.println("Enter number 2");
		n2 = sc.nextInt();
		
		System.out.println("Enter number 3");
		n3 = sc.nextInt();
		
		if(n1 > n2) {
			System.out.println(n1 + " is the largest number");
		}else {
			System.out.println(n2 + " is the largest number");
		}
		}

	}

}
