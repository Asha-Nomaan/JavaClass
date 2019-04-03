package com.class14;

public class ReverseStringTask {
	public static void main(String[] args) {

		String sentence = "Brownies & Cake. The master is speaking";
		String reverse="";
		for (int i = sentence.length() - 1; i >= 0; i--) {
			reverse=reverse+sentence.charAt(i);		
	}
		String[] words=reverse.split(" ");
		for(int i=words.length-1; i>=0; i--) {
			System.out.print(words[i]+" ");
		}
}
}
