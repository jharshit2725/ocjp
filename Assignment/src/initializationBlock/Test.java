package initializationBlock;

class ParentTest{
	ParentTest(){
		System.out.println("Parent class const");
	}
}
public class Test extends ParentTest {
	Test(){
		System.out.println("no arg const.");
	}
	Test(int x){
		System.out.println("1 arg const");
	}
	
	static {
		System.out.println("1st static block");
	}
	{
		System.out.println("1st inst block");
	}
	
	{
		System.out.println("2nd inst block");
	}
	static {
		System.out.println("2nd static block");
	}
	public static void main(String[] args) {
		new Test();
		new Test(3);
	}
}
