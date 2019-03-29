package com.class5;

import java.util.Scanner;

public class PeoplesHeight {

	public static void main(String[] args) {
		
		Scanner myScanner;
		int height;
		
	myScanner=new Scanner(System.in);
	System.out.println("Please enter your height");
	
	height =myScanner.nextInt();
	if(height<=5) {
		System.out.println("You are short");
	}else if(height>=5 && height<6) {
		System.out.println("You are medium");
	}else if(height>=6) {
		System.out.println("You are tall");
	}else {
		System.out.println("Youre an alien");
	}
	
	
	
	
		

	}

}
