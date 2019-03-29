package com.class12;

public class ForEachIn2D {
	public static void main(String[] args) {
/* Create a grocery list: fruits{}
 * 						Veggies{}
 * 						Dairy{}
 * Retrive all values using 2 different loops
 */
		String[] [] groceryList= {
				{"Apple", "Gauva", "Orange"},
				{"Broccoli", "Letteuce", "Squash"},
				{"Milk", "Butter", "Yogurt"}
		};
		
		for(String[] list:groceryList) {
			for(String item:list) {
				System.out.println(item);
			}
		}

		
}
	}
