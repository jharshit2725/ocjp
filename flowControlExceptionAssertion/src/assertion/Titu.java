package assertion;

public class Titu {

	public static void main(String[] args) {		

		int x=3;
		switch(x){
		case 1:System.out.println("yes"); break;
		case 2:System.out.println("yes"); break;
		default:assert true;
		}
		
        try{
        	assert(3>4):new Titu();
        } catch(AssertionError e){
        	e.printStackTrace();
        }

	}
}
