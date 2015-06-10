package com.hash.ocjp.statics;

public class Child {
	
	public static void main(String[] args) {
		staticMethod();
	}
	static void staticMethod(){
		System.out.println("Child static");
		Parent parent=new Parent();
		parent.nonStaticMethod();
	}
}
