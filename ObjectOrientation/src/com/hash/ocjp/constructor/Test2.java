package com.hash.ocjp.constructor;

class Test1{
	Test1(int x){
	}
	
//	Test1(){
//	}
}

public class Test2 extends Test1{  //giving error due to no no-arg constructor
//	Test2(){
//		
//	}
	public Test2(int x) {
		super(10);
	}

}
