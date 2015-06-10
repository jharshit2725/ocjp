package com.hash.ocjp.legalReturn;

public class Horse extends Animal{

	// public String eat(){   //illegal as it has to change the argument for being overloaded 
	public String eat(int x){	
		System.out.println("Horse animal eating  grass food");
		System.out.println("***Using super to invoke an overridden method----");
		super.eat();
		return null;
	}

}
