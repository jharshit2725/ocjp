package com.ocjp.oops.refVarCasting;

public class Horse extends Animal {
	public void display(){
		System.out.println("horse version");
	}
	
	public void makeHorseSound(){
		System.out.println("Neigh..........");
	}
	
	public static void main(String[] args) {
		Horse horse=new Horse();
//		Horse horse2=(Horse) new Animal();
//		horse2.display();
		Animal animal=new Horse();
		Horse horse2= (Horse) animal;
		horse2.display();
		Animal animal2=new Animal();
		Horse horse3=  (Horse) animal;
		horse3.display();
	}
}
