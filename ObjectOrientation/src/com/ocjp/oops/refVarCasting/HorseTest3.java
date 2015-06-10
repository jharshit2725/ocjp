package com.ocjp.oops.refVarCasting;

public class HorseTest3 extends Animal{
	public static void main(String[] args) {
		Animal animal=new Animal();
		HorseTest3 horse=(HorseTest3) animal;  //will show run time error as it cant be downcasted

	//	String s=(String) animal;  // compile time error
	}
}
