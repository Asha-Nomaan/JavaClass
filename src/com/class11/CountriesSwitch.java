package com.class11;

public class CountriesSwitch {
	public static void main(String[] args) {
		String[] countries= {"Pakistan", "Canada", "Itlay"};
		
		for(String country:countries) {
			switch(country) {
			case "Pakistan": 
				System.out.println("Islamabad");
			break;
			case "Canada" :
				System.out.println("Ottawa");
				break;
			case "Itlay":
				System.out.println("Rome");
				break;
			}
		}
		
	}

}
