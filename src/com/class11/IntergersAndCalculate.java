package com.class11;

public class IntergersAndCalculate {
	public static void main(String[] args) {
	
	   int[] num= {2,4,6,8};
	   int sum=0;
	   
	   for(int i=0; i<num.length; i++) {
		   sum=sum + num[i];
	   }
		System.out.println(sum);

		int add=0;
		for(int numbers:num) {
			add=add+numbers;
	}
		System.out.println(add);

}
}
