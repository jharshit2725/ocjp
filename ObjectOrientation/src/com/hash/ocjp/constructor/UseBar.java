package com.hash.ocjp.constructor;

public class UseBar extends Bar {
	UseBar(){
		
		super(10,10);
		
		System.out.println("xx");
	//	super(); error
	}
	void UseBar(){
		System.out.println("method named with class name");
	}
	
	public static void main(String[] args) {
		new UseBar().UseBar();
	}
}
