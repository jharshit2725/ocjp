package com.hash.ocjp.constructor;

public class PrivateConstructor2 {

	public static void main(String[] args) {
	//	PrivateConstructor constructor1= new PrivateConstructor(); since the constructor is private
		PrivateConstructor constructor2=PrivateConstructor.getInstance();
		PrivateConstructor constructor3=PrivateConstructor.instance;
	}
}
