package com.hash.ocjp.interfaces;

// public class Tire  implements Rotatable extends  Circle {  //extends should be the first
public class Tire  extends  Circle implements Rotatable {
	//	public void bounce() {		
	//		
	//	}	
	public void setBounceFactor(int fac) {		

	}
	public void setRpm(int r) {
		// TODO Auto-generated method stub		
	}
	Bounceable bounceable=new Tire();
}
