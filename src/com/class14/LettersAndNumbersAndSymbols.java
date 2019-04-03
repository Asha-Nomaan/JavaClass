package com.class14;

public class LettersAndNumbersAndSymbols {
public static void main(String[] args) {
	
	String str="252 We Hungry :/ 453";	
	String gone= str.replaceAll("[^A-Za-z]", "");
	System.out.println(gone.length());
}
}
