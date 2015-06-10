package com.ocjp.oops.refVarCasting;

public class ArgumentPassing {	
	public static void main(String[] args) {
		short a=10;
		method1(a, 100);
		
		int b=10;
		method2((short)b, 100);  //int is not a short , hence compile fail
	}

	public static void method1(int x, int y){		
	}
	
	public static void method2(short x, int y){		
	}
}
