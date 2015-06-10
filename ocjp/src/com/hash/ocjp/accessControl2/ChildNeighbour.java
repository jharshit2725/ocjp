package com.hash.ocjp.accessControl2;

public class ChildNeighbour {
public static void main(String[] args) {
	Child child=new Child();
//	child.x;       //showing error as we cant access the protected member of the parent class
	  child.display();
	 System.out.println(child.pub);
}
}
