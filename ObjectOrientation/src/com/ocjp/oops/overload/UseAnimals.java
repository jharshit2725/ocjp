package com.ocjp.oops.overload;

public class UseAnimals {

	public void doStuff(Horse horse){
		System.out.println("in the Horse version");
	}
	
	public void doStuff(Animal animal){
		System.out.println("in the animal version");
	}
	
	public static void main(String[] args) {
		UseAnimals animals=new UseAnimals();
		Animal animal=new Animal();
		Horse horse=new Horse();
		Animal animal2=new Horse();
		
		animals.doStuff(animal);
		animals.doStuff(horse);
		//using the reference of supertype to object of subclass
		animals.doStuff(animal2);
		
	}
}

