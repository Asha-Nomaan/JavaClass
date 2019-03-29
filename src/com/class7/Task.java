package com.class7;

public class Task {
	/*create a boolean variable workDay and assign true 
	 * create in variable day and assign it to 1
	 *  as long as it is workDay print--> I need a day off and increment day
	 *  day once day is 6--> your condition for your loop should become false*/

	public static void main(String[] args) {
		boolean workDay=true;
		int day=1;
		
		while (workDay) {
			System.out.println("I need a day off");
			
			if(day==6) {
				System.out.println("I DON'T need a day off");
				workDay=false;
			}
			day++;
		}

		
	
	}

}
