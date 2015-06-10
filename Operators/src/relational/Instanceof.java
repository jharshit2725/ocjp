package relational;

interface Foo{	
}
class A implements Foo{
}

class B extends A{
	void doStuff(){
		System.out.println("a refers b");
	}
}

public class Instanceof {
	public static void main(String[] args) {
		A a=new B();
		System.out.println(a instanceof B);        
		B b = new B();
		System.out.println(b instanceof Object);        
		A a2= new A();
		System.out.println("a2 instanceof B:- "+ (a2 instanceof B));        
		System.out.println(null instanceof Object);
		
		A[] bs=new B[10];
		
		System.out.println(bs instanceof Object);
	//	System.out.println(bs instanceof A); //incompatible comparison
		
	//	Double f2 = 42.0f;
	//	Double[][] f2 = {{42.0f}, {1.7f, 2.3f}, {2.6f, 2.7f}};
		Long x = 42l;
	}
	
    



}
