package wrapperclassandboxing;

public class WrappingAndEquals {

	public static void main(String[] args) {
		
//		 Boolean
//		 Byte
//		 Character from \u0000 to \u007f (7f is 127 in decimal)
//		 Short and Integer from -128 to 127
//		Note: When == is used to compare a primitive to a wrapper, the wrapper will be
//		unwrapped and the comparison will be primitive to primitive.
		
		Integer integer= 128;
		Integer integer2=128;
		System.out.println("128 integer==integer2 "+(integer==integer2));
		System.out.println("128 integer!=integer2 "+(integer!=integer2));
		
	    integer= 100;
	    integer2=100;
		System.out.println("100 integer==integer2 "+(integer==integer2));
		System.out.println("100 integer!=integer2 "+(integer!=integer2));
		
		
	}
}
