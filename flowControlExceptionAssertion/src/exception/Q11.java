package exception;

public class Q11 {

	public static void main(String[] args) {
		
		try {
			throw new Error();
		} catch (Error e) {
			System.out.println("handeled");
		}finally{
			System.out.println("in finally");
			doDivideByZero();
			System.out.println("Enjoy");
		}
		
	}

	private static int doDivideByZero() {
		
		return 7/0;
		
	}
	
	
}
