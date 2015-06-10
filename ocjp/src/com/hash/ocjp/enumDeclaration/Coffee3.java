package com.hash.ocjp.enumDeclaration;

public class Coffee3 {

	enum CoffeeSize{SMALL,BIG,LARGE}
	//semicolon is optional
	public static void main(String[] args) {
		Coffee coffee=new Coffee();
		coffee.size=CoffeSize.BIG;
	//	coffee.size=CoffeeSize.BIG;
	}

}
