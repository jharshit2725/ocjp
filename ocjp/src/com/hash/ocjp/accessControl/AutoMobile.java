package com.hash.ocjp.accessControl;

public class AutoMobile {
	
	void defaultMethod(){
		System.out.println("In the AutoMobile class ---------default---- method");
	}

	public void testAutoPublicMethod(){
		System.out.println("In the AutoMobile class public method");
	}

	private void testAutoPrivate(){
		System.out.println("This portion is private");
	}
	
	protected void testAutoProtected(){
		System.out.println("This portion is protected");
	}


}
