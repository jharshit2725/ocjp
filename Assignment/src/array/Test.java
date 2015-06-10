package array;

public class Test {
	static  int [] js;
	static int [] js2=new int[50];
	
int i=0;
	public static void main(String[] args) {
		int [] is=new int[5];
		System.out.println(is[0]);
		
		Test[] tests=new Test[5];
		System.out.println(tests[0]);
		
		int [][] is2=new int[3][]; //multidimension array
		System.out.println(is2[0]);  //giving null
	//	System.out.println(is2[0][0]); //giving null pointer exception as the all the elements are initialized with null initially
		
		 System.out.println("//multidimension array declaration i.e also fine");
		int [][] is4=new int[3][2]; //multidimension array declaration i.e also fine
		System.out.println(is4[0][0]); //will output zero
		System.out.println(is4[0][2]); //will give array outofbound exception
		
		is2[0] = new int[2];
		System.out.println(is2[0][0]); 
		
		System.out.println(js); //not initialized intance variable		
		int is3[] ;
//		System.out.println(is3); //not initialized local variable
		System.out.println(is2[0][0]); 
		System.out.println(js[0]); // giving null pointer as not initialized
		System.out.println(js2[0]);
		
		
	}
}
