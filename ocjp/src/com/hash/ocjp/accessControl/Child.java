package com.hash.ocjp.accessControl;

public class Child extends Parent {

	public static void main(String[] args) {
		Child child=new Child();
		System.out.println(child.x);
			child.y=10;
		Parent parent=new Parent();
		System.out.println(parent.x);//  For a subclass inside the package, the protected member can be accessed 
		//without inheritence also
	}

	int display(){
		return x;		
	}

}
