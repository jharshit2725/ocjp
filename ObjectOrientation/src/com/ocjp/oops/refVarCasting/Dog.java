package com.ocjp.oops.refVarCasting;

public class Dog implements Pet {


	public void beFriendly() {
		System.out.println("Dog is friendly is with members");		
	}

	public void makeSound(){
		System.out.println("Bark....");
	}

	public static void main(String[] args) {
		Dog dog=new Dog();
		Pet pet=(Pet)dog; //implicit UPcasting
		pet.beFriendly();
		//pet.makeSound();//showing error
	}

}
