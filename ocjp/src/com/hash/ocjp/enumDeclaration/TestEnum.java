package com.hash.ocjp.enumDeclaration;

enum Animals {
	DOG("woof"), CAT("meow"), FISH("burble");
	String sound;
	Animals(String s) { sound = s; }
	
}

public class TestEnum {
//	Animals a;
	static Animals a;
	public static void main(String [] args) {
		System.out.println(a.DOG.sound + " " + a.FISH.sound);		
		Animals animals=Animals.CAT;
	}
}
