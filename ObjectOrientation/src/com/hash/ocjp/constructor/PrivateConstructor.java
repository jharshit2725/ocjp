package com.hash.ocjp.constructor;

public class PrivateConstructor {
 
	public static final PrivateConstructor instance=new PrivateConstructor();
	
	private PrivateConstructor(){
		
	}
	static PrivateConstructor getInstance(){
		return new PrivateConstructor();
	}
}
