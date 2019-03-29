package com.class7;

public class OddNumbers {

	public static void main(String[] args) {
		/* print only odd number 1-20 */
		int num = 1;
		while (num <= 20) {
			//System.out.println("I am inside while loop");

			if (num % 2 != 0) {
				System.out.println(num);
			}
			num++;
			/* print only even numbers from 10-100*/
			
			int num2=10;
			while(num<=100) {
				if(num % 1 !=0) {
					System.out.println(num);
				}
			}
			
			
			
		}
	}

}
