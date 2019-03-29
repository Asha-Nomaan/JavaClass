package com.class11;

public class RetrievingAllValues {
public static void main(String[] args) {
	
	int[] [] num= {
			{11,12,13,14}, //4
			{21,22,23}, //3
			{31,32,33,34} //4
	};
	
	//int rows=num.length;
	//System.out.println(rows);
	
	//int cols=num[1].length;
	//System.out.println(cols);
	
	for(int row=0; row<num.length; row++) {
		
		for(int col=0; col<num[row].length; col++) {
			System.out.println(num[row][col]+" ");
		}
		System.out.println();
	}
	String[] [] food= {//3,4
			{"Burger", "Fries", "Hot Dog", "Meatloaf"},
			{"Lo mein", "fried rice"},
			{"Biryani", "Korma", "Naan", "Chick peas"}
	};
	
	for(int i=0; i<food.length; i++) {
		
		for(int j=0; j<food[i].length; j++) {
			System.out.print(food[i][j] +" ");
		}
		System.out.println();
	}
	
	
	}
}

