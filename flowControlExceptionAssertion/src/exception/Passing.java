package exception;

import java.io.EOFException;
import java.io.IOException;




public class Passing {

	void doStuff(){
		
			doMore();
		
		
		System.out.println("came out");
	}

	private static void doMore() {
				try {
					throw new EOFException();
				} catch (EOFException e) {
					// TODO Auto-generated catch block
//					e.printStackTrace();
//					throw new EOFException();
				}
	}
	
	public static void main(String[] args) {
		new Passing().doStuff();
	}
	
}
