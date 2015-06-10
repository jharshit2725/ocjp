package com.hash.ocjp.NonAccessMemberModifier;

public class Child extends CheckAbstrat {

	public static void main(String[] args) {
		Child child=new Child();
		child.doThat();
	}
	public void doThat() {
		System.out.println("implementing abstract method");
		
	}
	
	@Override
	protected void doProtectedAbstract() {
		// TODO Auto-generated method stub
		
	}

}
