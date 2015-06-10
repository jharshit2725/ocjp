package exception;

public class Q13 {
static String string;
	public static void main(String[] args) {
		
		try {
			dorecurse();
		} catch (Exception e) {
			System.out.println("handeled");
		}finally{
			System.out.println("in finally");
			
		}
		
	}

	private static void dorecurse() {		
		//dorecurse();		
		string.charAt(0);
	}
	
	
}
