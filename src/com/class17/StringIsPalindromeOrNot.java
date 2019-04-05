package com.class17;

public class StringIsPalindromeOrNot {

	public static void main(String[] args) {
		
		StringIsPalindromeOrNot str=new StringIsPalindromeOrNot();
		str.palindrome("Hannah");
		str.palindrome("Bob");
		str.palindrome("John");
		str.palindrome("Shaban");
		str.palindrome("Bilal");
		str.palindrome("Asha");

	}void palindrome(String str){
		String rev="";
		for(int i=str.length()-1; i>=0; i--) {
		 rev+=str.charAt(i);
	}
		if(rev.equalsIgnoreCase(str)) {
			System.out.println(str+" is palindrome");
		}else {
			System.out.println(str+" is not palindrome");
		}
		
	}
}
