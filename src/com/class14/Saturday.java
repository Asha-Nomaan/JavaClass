package com.class14;

public class Saturday {
	public static void main(String[] args) {

		String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] sentence = a.split("[?]"); // or use [\\?] if the question mark doesn't work
		System.out.print(sentence.length);

	}
}
