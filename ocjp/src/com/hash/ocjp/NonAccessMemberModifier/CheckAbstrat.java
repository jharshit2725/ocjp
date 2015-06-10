package com.hash.ocjp.NonAccessMemberModifier;

public abstract class CheckAbstrat{
	public final int x=10;
	public abstract void doThat();	
	private void doPrivate(){
	}	
	protected abstract void doProtectedAbstract();	
	public void doIt(){		
		System.out.println("Non Abstract Method of the abstract class");
	}
}

