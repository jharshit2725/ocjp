package overloadingboxing;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		float f=1.23f;
		int i=(int) f;
		System.out.println(i);
		doStuff((int) f);
		doStuff2(new Integer(5));
		//doStuff3(i); // giving error as we are widening and box
		int string= System.in.read();
		System.out.println(string);
	}

	private static void doStuff3(Long i) {
		// TODO Auto-generated method stub
		
	}

	private static void doStuff2(long integer) {
		// TODO Auto-generated method stub
		
	}

	private static void doStuff(long i) {
		// TODO Auto-generated method stub
		
	}
}
