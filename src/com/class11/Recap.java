package com.class11;

public class Recap {

	public static void main(String[] args) {

		// lets create an array of names that will hold 5 elements and retreve all
		// values from it

		String[] names = new String[7];

		names[0] = "Asel";
		names[1] = "Awet";
		names[2] = "Arif";
		names[3] = "Weqas";
		names[4] = "Dzmitri";
		names[5] = "Shiva"; // will get an runtime exception when trying to access it
		names[6] = "Sandesh";

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}

		// 2. create an array using array literal

		String[] studentNames = { "Shaban", "Bilal", "Mehmet", "Zaki", "Samir", "Frank" };

		System.out.println("-----For Loop----");
		for (int i = 0; i <= studentNames.length - 1; i++) {
			System.out.println(studentNames[i]);
		}

		// retrieve values using: advanced for loop, for each loop, enhanced for loop

		System.out.println("-----Advance for loop------");
		for (String student : studentNames) {
			System.out.println(student);
		}
	}
}
