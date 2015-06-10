package com.hash.ocjp.interfaces;

public abstract class Ball implements  Bounceable {

	public void bounce() {
		System.out.println("Ball bounces");
	}
	
	abstract void getShape();
	
}


