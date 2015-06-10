package wrapperclassandboxing;

class Parent{	
}
class Child extends Parent{
}

public class WideningReferenceVariable {

	static void dostuff(Parent p){
	}
	static void dostuff(Integer i){
	}
	public static void main(String[] args) {
		Child child=new Child();
		dostuff(child);
		
		Short short1=new Short((short) 1);
	//	dostuff(short1); // Giving error can't be widened
	}
}
