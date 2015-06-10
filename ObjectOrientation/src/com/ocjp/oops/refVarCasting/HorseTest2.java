package com.ocjp.oops.refVarCasting;

public class HorseTest2 {
	public static void main(String[] args) {
		Animal animal=new Animal();
		Horse horse=(Horse) animal;  //will show run time error as it cant be downcasted

	//	String s=(String) animal;  // compile time error
	}
}
