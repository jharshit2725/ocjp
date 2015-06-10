package com.ocjp.oops.overriding;

import java.sql.SQLException;

public class Animal {
	
	Animal overridenMethodwithSubtype(){
		System.out.println("overridenMethodwithSubtype");
		return new Animal();
	}
	
	Horse overridenMethodwithSupertype(){
		System.out.println("overridenMethodwithSubtype");
		return new Horse();
	}
	
	public final void livingStatus1(){
		System.out.println("animal is a living thing");
	}
	
	private final void livingStatus2(){
		System.out.println("animal is a living thing");
	}
	
	public void eat(){
		System.out.println("Generic animal eating generic food");
	}

	public void makeSound(){
		System.out.println("Generic animal making generic sound");
	}
	
	public void getAge() throws Exception{	
		System.out.println("Generic animal having generic age");
		
	}
	
	protected void getss(){
		System.out.println("protected method getss in Animal");
	}
	
	protected void putss(){
		System.out.println("protected method getss in Animal");
	}
	
	public static void getanimalClass(){
		System.out.println("static method getanimalClass in Animal");
	}
	
	public void getAnimalChild() throws NumberFormatException{
		System.out.println("give the names of animal Child");
	}
	
	public void methodWithExceptionInParent() throws SQLException{
		
		System.out.println("I am parent methodWithExceptionInParent ");
		
	}
	
}
