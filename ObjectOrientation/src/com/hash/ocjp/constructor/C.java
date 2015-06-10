package com.hash.ocjp.constructor;

class A {

	protected A(){ //cant be private
		System.out.println("A contruct");
	}
}

class B extends A{
	private B(){  //thats ok here
		System.out.println("B contruct");
	}
}

public class C extends A{
	public C(){
		System.out.println("C contruct");
	}
	public static void main(String[] args) {
		new C();
	}
}
