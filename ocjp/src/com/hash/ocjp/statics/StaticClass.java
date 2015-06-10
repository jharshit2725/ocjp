package com.hash.ocjp.statics;

public class StaticClass {

	static int staticMember;
	int nonStatic;
	static void staticmethod(){
		staticMember=10;
	//	nonStatic=5;      //cannot make a static reference to the non-static field nonStatic
	}
	void nonStaticMethod(){
		staticMember=10;
		nonStatic=5;	
	}
}
