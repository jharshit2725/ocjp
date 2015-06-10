package wrapperclassandboxing;

public class BoxingTest {

	public static void main(String[] args) {
		Integer integer=new Integer(225);		
		Integer integer2=integer;
		
		Character c1 = new Character('c');
		Character c2 = c1;
		
		System.out.println("integer2==integer: "+(integer2==integer));
		System.out.println("c1==c2: "+(c1==c2));
		integer++;
		System.out.println("After increment of integer, integer2==integer: "+(integer2==integer));		
		System.out.println(doStuff(42));		
	}
	
	static boolean doStuff(int x){
		Boolean boolean1=false;		
		if(!boolean1){ //unboxing
			System.out.println(x);
		}
		return boolean1; //unboxing
		
	}
}
