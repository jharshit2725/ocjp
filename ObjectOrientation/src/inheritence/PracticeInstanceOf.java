package inheritence;

public class PracticeInstanceOf {

	public static void main(String[] args) {
		PracticeInstanceOf of = new PracticeInstanceOf();
		PracticeInstanceOf of2 = new PracticeInstanceOf();
		if(!of.equals(of2)){
			System.out.println("they are not equal");
		}
		if(of instanceof Object){
			System.out.println("of is instance of obj");
		}
	}
}
