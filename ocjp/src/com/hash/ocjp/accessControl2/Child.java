package com.hash.ocjp.accessControl2;

import com.hash.ocjp.accessControl.Parent;
// import com.hash.ocjp.accessControl.DefaultClass;  //unable to import default class

public class Child extends Parent {

	public static void main(String[] args) {
		Child child=new Child();
		System.out.println(child.x); //accseing protected by inheritence
		//	child.y=10;  //default
		Parent parent=new Parent();
		//System.out.println(parent.x);   //For a subclass outside the package, the protected member can be accessed only
		//   through inheritance.
	}

	int display(){
		return x;		
	}

}
