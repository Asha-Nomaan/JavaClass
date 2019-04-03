package com.class16;

public class Phone {

	String model, color;
	int gb, screen;
	
	public static void main(String[] args) {
		Phone ph=new Phone();
		
		ph.model="iPhone XR";
		ph.color="Rose Gold";
		ph.gb=256;
		ph.screen=6;
		
		ph.texting();
		ph.calling();
		ph.takingPhoto();
		
		Phone ph2=new Phone();
		
		ph2.model="Galaxy s6 edge";
		ph2.color="Black";
		ph2.gb=164;
		ph2.screen=5;
		
		ph2.texting();
		ph2.calling();
		ph2.takingPhoto();
		
		Phone ph3=new Phone();
		
		ph3.model="Nokia";
		ph3.color="Silver";
		ph3.gb=16;
		ph3.screen=4;
		
		ph3.texting();
		ph3.calling();
		ph3.takingPhoto();
	}
	
	void texting() {
		System.out.println("I want to text on my "+model);
	}
	void calling() {
		System.out.println("I want to call on my "+model);
	}
	void takingPhoto() {
		System.out.println("I want to take a photo on my "+model);
	}
	
	
}
