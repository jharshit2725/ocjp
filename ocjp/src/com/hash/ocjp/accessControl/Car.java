package com.hash.ocjp.accessControl;

import com.hash.ocjp.accessControl.AutoMobile;


public class Car extends AutoMobile {

	public static void main(String[] args) {
		Car Car=new Car();
		Car.testCar();
		//	coolMethod();
		//	this.testCar();     //giving error
		//	testCar();           //giving error
		//  coolMethod();
		//	zoo.zooPrivate();		
		Parent parent=new Parent();
		System.out.println(parent.x);
	}

	public void testCar(){
		testAutoPublicMethod();
		defaultMethod();
		testAutoProtected();
	//	testAutoPrivate();  //private member not visible
		//	zooPrivate();
	}


}
