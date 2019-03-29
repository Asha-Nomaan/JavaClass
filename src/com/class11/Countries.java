package com.class11;

public class Countries {
	public static void main(String[] args) {
		
		String[] countries= {"Pakistan", "Canada", "Itlay"};
		for(int i=0; i<countries.length; i++) {
			if(countries[i].equals("Pakistan")) {
				System.out.println("Islamabad");
			}else if (countries[i].equals("Canada")) {
				System.out.println("Ottawa");
			}else if (countries[i].equals("Italy")) {
				System.out.println("Rome");
			} 
			
		}
		}
	}


