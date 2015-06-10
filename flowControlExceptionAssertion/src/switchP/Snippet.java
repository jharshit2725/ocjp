package switchP;

public class Snippet {
	public static void main(String[] args) {
		int x = 3;
		final int b=2;
		x=9;
		int i =5;
		
		switch (x-1){
		case 1:	System.out.println("x equals 1");
		System.out.println("using curly braces"); break;
		case 2:	System.out.println("x equals 2"); break;
		case 3:	System.out.println("x equals 3"); break;
		default : System.out.println("x equals some other value");
		case 4:	System.out.println("x equals 4"); break;
		case b+3:	System.out.println("x equals 5");   // The case constant must be a literal or final variable, or a constant
		//expression, including an enum. You cannot have a case that includes a nonfinal
		//variable, or a range of values.
	//   case i: System.out.println("unable to use non final");   // Not working
		}

	}
}

