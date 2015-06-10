package relational;

public class Compare {
	
	enum Color{Red, Blue}

	public static void main(String[] args) {
		boolean b=4>=4;
		System.out.println(b);
		
		char ch='7';
		System.out.println(ch);
	//	System.out.println(b==ch); compile error as we are comparing wrong types		
		System.out.println("5.0==5?"+(5.0==5));  //compaaring floating point with int and value same treturning true
		boolean x = false;
		if(x=true){
			System.out.println(x);
			
		}
		// Enum
		Color c1 = Color.Red ;
		Color c2 = Color.Red ;
		if(c1==c2){
			System.out.println("the enums are equals");
		}
		
	}
}
