package com.class17;

public class LargestNumber {
	
	public static void main(String[] args) {
		
		LargestNumber num=new LargestNumber();
		num.findLargest(250, 4215);
		
	}
		
		void findLargest(int a, int b) { // method with 2 parameters b 

			if (a > b) {
				System.out.println("A is larger than B");
			} else {
				System.out.println("B is larger than A");
			}
		
	}

}
