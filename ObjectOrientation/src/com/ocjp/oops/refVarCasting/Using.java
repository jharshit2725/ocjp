package com.ocjp.oops.refVarCasting;

//ClassCastException will be thrown when the code attempts to downcast a
//Parent to a Child.
class Parent {	
}
class Child extends Parent{
}

public class Using{
	public static void main(String[] args) {
		new Using().use(new Child(), new Parent());
		new Using().use(new Child(), (Child)new Parent());
	}
	void use(Child child, Parent passing2){		
	}
}
