	package com.hash.ocjp.varArgs;

public class VarArg {
	
	public static void main(String... args) {
		VarArg arg=new VarArg();
		arg.doStuf(1,2,34,5);
	}

	void doStuf(int... x){
		int sum=x[0]+x[1]+x[2]+x[3];
		System.out.println("sum is "+sum);
	}
	
//	void doStuf1(int x...){       //invalid declaration
//		int sum=x[0]+x[1]+x[2]+x[3];
//		System.out.println("sum is "+sum);
//	}
	static void doStaticStuff(){
		int x=13;
	}
}
