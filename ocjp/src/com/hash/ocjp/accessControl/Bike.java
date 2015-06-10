package com.hash.ocjp.accessControl;

public class Bike {
	
	public static void main(String[] args) {
		
	AutoMobile mobile=new AutoMobile();
	mobile.defaultMethod();
	mobile.testAutoPublicMethod();	
	mobile.testAutoProtected();
	}

	public void useACar(){
		Car car= new Car();
		car.testCar();
	}

}
