
public class Scope {

	Scope(){
		int x = 10;
	}
	public static void main(String[] args) {
		//x=16; //error as out of scope
	}
	
	public void go(){
		//x=10;//error as out of scope
	}
}
