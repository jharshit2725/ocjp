package com.ocjp.oops.overriding;

class Prac {

	void doStuff(){
		System.out.println("doing parent class stuff");
	}
}

class PracChild extends Prac{
	void doStuff(String kind){
		System.out.println("doing xhild stuff "+kind);
	}
}

public class Test{
	
	public static void main(String[] args) {
		Prac prac=new Prac();
		Prac prac2=new PracChild();
		prac.doStuff();
	//	prac2.doStuff("hi");
	}
	
}