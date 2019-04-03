package com.class14;

public class LargestNumber {
	public static void main(String[] args) {
		int[] array = { 6, 12, 18, 24, 55, 100, 80 };

		int largest = array[0];
		int Secondlargest = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > largest) {
				Secondlargest = largest;
				largest = array[i];
			} else if (array[i] > Secondlargest) {
				Secondlargest = array[i];
			}
		}
		System.out.println("the second largest is " + Secondlargest);
		
		/*
		 * ANOTHER WAY TO DO IT
		 * -----------------------
		 */
		// INT ARR[]={144,46,0,86,292,-1};
		// int min= arr[0]; //144
		// int secondLargest=0; //144
		// int largest =0; //144
		// for(int a: arr){
		//if(a>largest){
		// largest =a;
		//}
		// if(a<min) {
		//min =a;
		//}
		//}
		//for(int a: arr) {
		// if(a> secondLarges && a< largest){
		// secondLargest =a;
		// }
		//}
		//System.out.println(“min = ” + min);
        //System.out.println(“Second Largest = ” + secondLargest);
        //System.out.println(“Largest = ” + largest);
	}
}
