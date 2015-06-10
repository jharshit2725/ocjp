package com.ocjp.oops.overload;

public class Horse extends Animal{
	
	public void eat(String s){//Thats an overloaded method not everriden so it wont show the error
		System.out.println("Generic animal eating generic food");
	}
	
//	public void eat(){
//		System.out.println("Horse animal eating  grass food");
//		System.out.println("***Using super to invoke an overridden method----");
//		super.eat();
//	}
//
//	public void getAge(){
//
//	}
//	public static void main(String[] args) {
//		Animal animal=new Horse();
//		animal.eat();
//		//	animal.getAge();   // error due to need of throws declaration or catching
//        Horse horse=new Horse();
//        horse.getAge();   //works fine
//	}
//	//	private void makeSound(){      //error due to more restricted access modifier
//	//		System.out.println("Horse animal making neigh sound");
//	//	}
}
