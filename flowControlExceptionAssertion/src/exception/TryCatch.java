package exception;

public class TryCatch {

	public static void main(String[] args) {
		
		int x;
		
		try{
			int n=10;
			x = n/0;
		}
//		catch(Exception exception){
//			System.out.println("Division by zero not allowed");
//		}
	//	System.out.println(""); //must imediately
		finally{
			x=0;
			System.out.println("setting x back to 0");
		}		
		System.out.println("Then new value of x is: "+x);
	}
}
