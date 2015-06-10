package com.hash.ocjp.legalReturn;

public class Beta extends Alpha {
	
	public Beta doStuff(){    //valid override as its covarient type 
		System.out.println("Doing Base Class Alpha Stuff");
		return new Beta();
	}
}
