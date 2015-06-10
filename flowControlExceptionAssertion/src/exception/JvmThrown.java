package exception;

public class JvmThrown {

//stackoverflow
	//nullpointer
	void go(){
		go();
	}
	public static void main(String[] args) {
		
		int i=22;
		int j = 10;
	//	
		System.out.println("hi");
		//new JvmThrown().go();
	}
}
