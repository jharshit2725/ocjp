package exception;

import java.io.IOException;

public class RunTimeExceptions {
	public static void main(String[] args) {
		try{
			//methodA();
		}catch(RuntimeException e){

		}
	}
	static void methodA() throws Exception{
		//throw new EOFException();	
		throw new Exception();
	}
	static void methodB() throws IOException{
		//throw new EOFException();	
		throw new IOException();  // need to import full qualified name for IOException
	}
	static void methodC() throws RuntimeException{
		//throw new EOFException();	
		throw new RuntimeException();
	}

}
