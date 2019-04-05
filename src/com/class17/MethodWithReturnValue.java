package com.class17;

public class MethodWithReturnValue {
	
	public static void main(String[] args) {
		String str="Hello";
		
		int stringLength=str.length();
		System.out.println(stringLength);
		
		MethodWithReturnValue obj=new MethodWithReturnValue();
		String day=obj.whatIsADay();
		System.out.println("Today is "+day);
	}
	void askHowAreYou(String name) { //parameter
		System.out.println("How are you " + name);
	}
	String whatIsADay() {
		return "Thursday";
	}
	
}
