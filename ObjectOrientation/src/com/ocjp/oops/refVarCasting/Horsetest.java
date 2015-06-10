package com.ocjp.oops.refVarCasting;

public class Horsetest {
	public static void main(String[] args) {
		int i=0;
		Animal []a = {new Animal(), new Horse() ,new Animal()};
		for(Animal animal:a){
			System.out.println("iteration: "+ (++i));
			if(animal instanceof Horse){
				//way 1
				Horse horse=(Horse) animal;
				horse.makeHorseSound();
				//way 2
				((Horse) animal).makeHorseSound();
			}
		}
	}
}
