package com.class12;

public class StringManipulations2 {

	public static void main(String[] args) {
//contains() --> checks for specific value in the string
		//if value is present --> 
		
		String str="Good morning, students!";
		boolean contains=str.contains("morning");
		System.out.println(contains);
		
		String present ="Welcome, Asha";
		String neededValue="WELCOME,";
		
		boolean flag=present.contains(neededValue);
		System.out.println(flag);
		
		boolean flag1=present.toLowerCase().contains(neededValue);
		System.out.println(flag1);
		//startsWith(), emdsWith(), --> will return true if string starts with second value
		//else --> false
		System.out.println("----StartWith & EndsWith------");
		String str1="syntax";
		boolean starts=str1.startsWith("s");
		System.out.println(starts);
		
		System.out.println(str1.endsWith("X"));
		
		//isEmpty() if length of a string is =--> string is empty else -> it is not empty
		System.out.println("----isEmpty()------");
		String str2=""; //if put space, it'll be false
		boolean isEmpty=str2.isEmpty();
		System.out.println(isEmpty);
		
		//concat() --> will concatenate 1 string to the end of another
		System.out.println("----concat()------");
		String str3="Hello";
		String str4="Ali!";
				System.out.println(str3+str4);
		System.out.println(str3.concat(str4));
		
		//trim () --> will remove spaces at the begining and at the end of your String
		System.out.println("----_____------");
		System.out.println("==============");
	    String expected="You may qualify for a multi-policy discount!";
	    String actual=" You may qualify for a multi-policy discount! ";
	    
	    actual=actual.trim();
	    System.out.println(expected.equals(actual));
		
		
		
		
	}
}
