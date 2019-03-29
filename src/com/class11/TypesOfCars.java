package com.class11;

public class TypesOfCars {
	public static void main(String[] args) {
		String [] [] cars= {
				{"American", "German", "Korean", "Italian"},
				{"Ford", "Prosche", "Hyundai", "Lambo"}
		}; 
		 for (int a=0;a<cars.length;a++) {
	            for(int b=0;b<cars[a].length;b++) {
	                System.out.println(cars[a][b]+"-the cars");
	}

}
	}
}
