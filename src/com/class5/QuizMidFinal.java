package com.class5;

import java.util.Scanner;

public class QuizMidFinal {

	private static Scanner input;

	public static void main(String[] args) {
		
int Quiz, Mid, Final, score ;
        
        
        input = new Scanner(System.in);
        System.out.println("Please enter Quiz Scores");
        Quiz=input.nextInt();
        
        System.out.println("Please enter Mid Term Score");
        Mid=input.nextInt();
        
        System.out.println("Please enter Final Score");
        Final= input.nextInt();
        score=(Quiz+Mid+Final)/3;
        
        System.out.println("Your average score is " + score);    
        
        
        
        if (score>=90) {
            System.out.println("You have a A");
        }else if(score>=70 && score<=90) {
            System.out.println("You have a B");
        }else if(score>=50 && score<=70) {
            System.out.println("You have a C");
        }else if (score<50) {
            System.out.println("You have a F");
        }else {
            System.out.println("Yeah nope.");
        }
	}

}
