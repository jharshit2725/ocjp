package com.hash.ocjp.interfaces;

public class BeachBall extends Ball {

	@Override
	public void setBounceFactor(int f) { //implementing first time
		// TODO Auto-generated method stub
		
	}
	
	public void bounce(){ //overriding
		System.out.println("Beach Ball bounces");
	}

	@Override
	protected void getShape() {
		// TODO Auto-generated method stub		
	}
	
//	public abstract void getShape1(); // abstract method can only be available in absstract class

}
