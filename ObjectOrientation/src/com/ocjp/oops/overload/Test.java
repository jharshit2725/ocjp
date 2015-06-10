package com.ocjp.oops.overload;

class Foo{
	void doStuff(){
		System.out.println("do parent stuff");
		
	}
}
public class Test extends Foo{

//	String doStuff(){ //invalid not a valid override or overload
//		System.out.println("do parent stuff");
//		return "has";
//	}
	
//	void doStuff(){// again invalid as, not a valid override or overload
//		System.out.println("do parent stuff");
//	}
//	
//	String doStuff(){
//		System.out.println("do parent stuff");
//	}
}
