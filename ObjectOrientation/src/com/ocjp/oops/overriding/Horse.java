package com.ocjp.oops.overriding;

import java.sql.SQLException;

public class Horse extends Animal{
	
	Horse overridenMethodwithSubtype(){ //will work fine
		System.out.println("overridenMethodwithSubtype");
		return new Horse();
	}
	
//	Animal overridenMethodwithSupertype(){   //wont work
//		System.out.println("overridenMethodwithSupertype");
//		return new Animal();
//	}
	
	
	public void eat(){
		System.out.println("Horse animal eating  grass food");
		System.out.println("***Using super to invoke an overridden method----");
		super.eat();
	}

	public void getAge(){  //need not throw the exception of the overridden method
		System.out.println("Horse age is 50");
	}
	
	public void carryTheBride(){
		System.out.println("yeah I am carrying the bridegroom in marriage");
	}
	
	public static void main(String[] args) {
		Animal animal=new Horse();
		animal.eat();
		  animal.getss(); //protected method in animal
		//  animal.methodWithExceptionInParent();  //though the object's class have method without exception, it is giving error as the parent class has exception declared 
		  animal.getanimalClass();
		  
		  ((Horse)animal).carryTheBride();
		  Horse horse1=(Horse) animal;
		  horse1.carryTheBride();
		//	animal.getAge();  //Error due to need of throws declaration or catching
		Horse horse=new Horse();
		horse.getAge();   //works fine
		horse.getanimalClass();
	}

//	protected void getss(){		 // getss is more restrictive in the horse class than animal
//		System.out.println("public method getss in horse");
//	}
	
	//	private void makeSound(){      //error due to more restricted access modifier
	//		System.out.println("Horse animal making neigh sound");
	//	}
	
//	 void putss(){  //error due to more restricted access modifier
//		System.out.println("protected method getss in Animal");
//	}
	
//	public final void livingStatus1(){    //error due to overriding final method
//		System.out.println("horse is a living thing");
//	}
	
	
//	public void getAnimalChild() throws SQLException{   //throwing new exception then the overriden
//		System.out.println("give the names of animal Child");
//	}
	
	public static void getanimalClass(){  //we can't override static method but can redefine name the method with same name and STATIC
		System.out.println("static method getanimalClass in Horse");
	}
	
	private void livingStatus2(){  //working fine as the private final method of animal was not inherited not visible hence not overriden
		System.out.println("animal is a living thing");
	}	
	
public void methodWithExceptionInParent(){
		
		System.out.println("I am child methodWithExceptionInParent without exception ");
		
	}

}
