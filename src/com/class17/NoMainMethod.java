package com.class17;

public class NoMainMethod {

	// methods and variables are member of the class
	String str;
	int num;

	// won't run unless you create a MAIN method
	void hello() {
		System.out.println("Hello");
		System.out.println("Hello friends");
	}

	void bye() {
		System.out.println("Bye");
	}

	public static void main(String[] args) { // method signiture

		NoMainMethod obj = new NoMainMethod(); // method body; new keyword creates the object

		obj.hello(); // we calling a method hello
		obj.bye();

	}

}
