package com.class13;

import java.util.Scanner;

public class BoyOrGirl {
	public static void main(String[] args) {
		/*
		 * Write a program that reads two people’s first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: 
		 * Example Output:
		 *  Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl?
		 *   boy Suggested baby
		 * name: DANRY
		 * Example Output:
		 *  Mom’s first name? Mary Dad’s first name? Daniel Boy or Girl?
		 * girl Suggested baby name: MAIEL
		 */
			
		Scanner sc = new Scanner(System.in);

        String fname, mname, gender, childName;
        System.out.println("enter f name");
        fname = sc.next();
        System.out.println("enter m name");
        mname = sc.next();
        System.out.println("enter gender");
        gender = sc.next();
        
        
        
        
        /*
        ANOTHER WAY TO DO IT :
        
        Scanner scan; 
		String motherName,fatherName, gender, babyName;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter mothers name");
		motherName=scan.nextLine();
		
		System.out.println("Please enter fathers name");
		fatherName=scan.nextLine();
		
		System.out.println("Please enter expected gender");
		gender=scan.nextLine();
		
		
		if(gender.equalsIgnoreCase("boy")) {
			babyName=fatherName.substring(0, fatherName.length()/2)+
					motherName.substring(motherName.length()/2);
		}else if(gender.equalsIgnoreCase("girl")){
		babyName=motherName.substring(0, motherName.length()/2)+
				fatherName.substring(fatherName.length()/2);
		}else {
			babyName="No suggestion";
			
		}
		System.out.println(babyName.toUpperCase());
	}

        System.out.println(fname.substring(0, 3) + mname.substring(0, 2));
		
		*/
	}
}