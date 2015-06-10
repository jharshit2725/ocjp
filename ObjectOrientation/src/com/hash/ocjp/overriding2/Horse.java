package com.hash.ocjp.overriding2;

public class Horse extends Animal {

	public static void main(String[] args) {
		Animal animal=new Horse();
		animal.eat();
	}
	
	void eat(){
		System.out.println("Eat grass and chana");
	}
}
