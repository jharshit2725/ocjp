package com.ocjp.oops.refVarCasting;

class ParentTest{

}
public class Test extends ParentTest{

	public static void main(String[] args) {

		// Test test=(Test) new ParentTest();

		ParentTest parentTest = new ParentTest();
//		Test test=(Test) parentTest; //compiling but failing at run time
		
		ParentTest parentTest2=new Test();
		Test test2= (Test) parentTest2; // Running fine
	}
}
