package com.hash.ocjp.legalReturn;

class Test {

	public Alpha doStuff(){
		return null;   //can return null with object reference return type
	}

	public String[] go(){
		//		return new String[] {"fred","Barney","olive"};//can return array
		String [] as = {"fred","Barney","olive"};
		return as;
	}

	public int foo(){
		//In a method with a primitive return type, 
		//you can return any value or variable that can be implicitly
		//converted to the declared return type.
		char c='c';
		return c;
	}

	public int fooo(){
		//In a method with a primitive return type, you can return any value or
		//variable that can be explicitly cast to the declared return type
		float f=3.5f;
		return (int) f;
	}

	public void bar(){
		//	return "this is it"; //  should not return anything
		return;   //we can return nothing to return early
	}

	public Object getObject(){
		//In a method with an object reference return type, you can return any
		//object type that can be implicitly cast to the declared return type.
		int[] nums={1,2,3};
		return nums;    // Return an int array,
		// which is still an object
	}	

	public Chewable getChewable(){
		return new Gum();  // can return subtype
	}
	public Boomer getGum(){
		//	return new Gum();  //error as cant return the supertype
		return new Boomer();
	}


}

interface Chewable{

}

class Gum implements Chewable{

}

class Boomer extends Gum{

}

abstract class Animals1 { }
class Bear extends Animals1 { }
class Test1 {
	Animals1 go() {
		return new Bear(); // OK, Bear "is-a" Animal
	}
}


class Animals2 { }
class Bear2 extends Animals2 { }
class DifferentReturnTypes {
	Bear2 go() {
		return (Bear2) new Animals2(); // Causes class Cast exception
	}

	public static void main(String[] args) {
		Bear2 bear2=new DifferentReturnTypes().go();
	}
}