package com.ocjp.oops.overload;

import com.hash.ocjp.statics.Parent;

public class Child {
	
	static Child child=new Child()  ;
	Parent parent=new Parent();
	
	public static void main(String[] args) {
		staticMethod();
	}
	static void staticMethod(){
		System.out.println("Child static");
		child.parent.nonStaticMethod();
	}
}
