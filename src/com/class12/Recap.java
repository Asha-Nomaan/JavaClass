package com.class12;

public class Recap {

	public static void main(String[] args) {
				
		int[] [] arr= {
				{1,2,3}, //1 array that stored with index 0
				{10,20,30}, //2 array with index 1
				{100,200,300} //3 array with index 2
		};
		//how many total arrays
		for(int i=0; i<arr.length; i++) {
			for(int j=0 ; j<arr[i].length; j++); {
				System.out.print(arr[i][j]);
				
			}
			System.out.println("-----For each loop-----");
		}
		for(int[] singleArray:arr) {
			for(int numbers:singleArray) {
				
				System.out.print(numbers+" ");
			}
			System.out.println();
		}
		}

	}


