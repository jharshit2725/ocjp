package com.hash.ocjp.legalReturn;

public class Alpha {

	Alpha doStuff(){
		System.out.println("Doing Base Class Alpha Stuff");
		return (Beta) new Alpha();
	}
}
