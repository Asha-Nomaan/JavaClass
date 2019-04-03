package com.class14;

public class StringManipulations {
public static void main(String[] args) {
	
		//1 replace() - will replace old char/value to new char/value
	
	String str="I am good tester#1!";
//	String newStr=str.replace("a", "e"); //replacing the characters or sometimes entire work with 2nd one
//	System.out.println(newStr);
//	
//	String newStr1=str.replace("good", "great");
//	System.out.println(newStr1);
//	
//	String newStr2=str.replace("tester", "programmer");
//	System.out.println(newStr2);
//	
//	String newStr3=str.replace("Tester", "programmer"); //will print old "tester" instead of "T" cuz of very first claim in string
//	System.out.println(newStr3);
	
	str=str.replace("!", "?");
	System.out.println(str);
	
	str=str.replace("1", "2");
	System.out.println(str);
	
	//2 replaceAll - will replace all that matches specified pattern[regex]
	
	String str1="12Hello 3234 World 465%^%";
	String replacedNoNumbers=str1.replaceAll("[0-9]", ""); //"" means replacing with nothing
	System.out.println(replacedNoNumbers);
	
	String newString=replacedNoNumbers.replaceAll("[^A-Z a-z]", ""); //^ means don't delete and space will add the space when it prints
	System.out.println(newString);
	
	//String replacedNoCharacter=replacedNoNumbers.replaceAll("[A-Za-z]", "");
	//System.out.println(replacedNoCharacter);
	
	String str2="1Hello123";
	str2.replaceAll("[^0-9]", "");
	System.out.println(str2.replaceAll("[^0-9]", ""));
	
	
}
}
