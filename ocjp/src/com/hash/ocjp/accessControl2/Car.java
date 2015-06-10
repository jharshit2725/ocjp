package com.hash.ocjp.accessControl2;

import com.hash.ocjp.accessControl.AutoMobile;

public class Car extends AutoMobile {

	public static void main(String[] args) {
		Car car=new Car();
		car.testCar();
		car.testAutoPublicMethod();
		car.testAutoProtected();
		
		AutoMobile mobile = new AutoMobile();
		mobile.testAutoPublicMethod();
		//	coolMethod();
		//	this.testCar();     //giving error
		//	testCar();           //giving error
		//  coolMethod();
		//	zoo.zooPrivate();
	}

	public void testCar(){
		System.out.println("inside the testCarMethod");
		testAutoPublicMethod();
		int x;
		final int x1=10;
		testAutoProtected();
		//	defaultMethod();
		//	zooPrivate();

	}
	
	public void testCar2(){
		this.testAutoPublicMethod();
	//	defaultMethod();   //default member not visible
		testAutoProtected();
	//	testAutoPrivate();  //private member not visible
	//	zooPrivate();
	}


}
