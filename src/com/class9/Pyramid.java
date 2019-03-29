package com.class9;

public class Pyramid {

	public static void main(String[] args) {
		// Row = 5 colum =6

        for (int a=1; a<=5; a++) {
            for(int b =1; b<=6; b++) {
                if (a==1 || a==5 || b==1 || b==6) {
                    System.out.print("&");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }


	}


