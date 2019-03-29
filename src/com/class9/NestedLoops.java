package com.class9;

public class NestedLoops {

	public static void main(String[] args) {
		
		for (int i=0; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int i=0; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int i=0; i<=5; i++) {
			System.out.print(i);
		}
		System.out.println();
		for (int i=0; i<=5; i++) {
			System.out.print(i);
		}

		/*I want to print patter
		 * 1111111 --> 7rows & 7 columns
		 * 2222222
		 * 3333333
		 * 4444444
		 * 5555555
		 * 6666666
		 * 7777777
		 */
		
		for (int i=1; i<=5; i++) {
			for (int y=1; y<=9; y++) {
				System.out.print(y);//12345
			}
			System.out.println();
		}
		for (int i=1; i<=7; i++) {
			for (int y=1; y<=7; y++) {
				System.out.print(i);//1111111 //2222222
			}
			System.out.println();
		}
		/* I want to print a pattern
		 * ***** rows=4 and cols=5
		 * *****
		 * *****
		 * *****
		 */
		for (int a=0; a<4; a++) {
			for (int b=0; b<5; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		/* I want to print a pattern
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 */
		for (int c=0; c<4; c++) {
			for (int d=5; d>0; d--) {
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
