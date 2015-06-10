package com.hash.ocjp.constructor;

class Test{
	Test(int x){
	}
}
public class Test3 extends Test{
	static int var;
	int var1;

	public Test3() {
		super(var);
	}

	public static void main(String[] args) {	
	}
}
