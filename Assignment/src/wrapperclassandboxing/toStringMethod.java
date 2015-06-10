package wrapperclassandboxing;

public class toStringMethod {

	public static void main(String[] args) {
		double d=1.23;
		String string=Double.toString(d);
		System.out.println(string);

		// String string2 = Short.toString(d); need to give short arguement
		// String string3 = Short.toString(121234); //giving error as not short but it is int
		short s=1234;
		String string3 = Short.toString(s);
		System.out.println(string3);
		
		//radix conversion
		String string2=Integer.toString(234,16);
		System.out.println(string2);

	}
}
