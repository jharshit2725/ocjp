import array.Initialization;



public class Test{
	char b;
	String string;
	static Test te=null;
	static Test te1;
	Initialization initialization;
	public static void main(String... a){
		Test test=new Test();
		Test test2;
		System.out.println(test.b);
		System.out.println(test.initialization);
	//	System.out.println(test2);
		System.out.println("te:" + te);
		System.out.println("hi");
		System.out.println("te==te1: "+(te==te1));
		System.out.println("a.length: "+a.length);
		System.out.println("string: "+test.string);
		
		for(String c:a){
			System.out.println(c+"hi");
		}
		
		
//		int b[]=new int[10];
		//check(b);
	}
//	static void check(int... b){
//		for(int i=0;i<10;i++){
//			System.out.println(b[i]);
//		}
//	}
}
//public class Mix {
//
//	String title;
//	public String getTitle(){
//		return title;
//	}
//	public static void main(String[] args) {
//		//difference is coming in the string variable and Mix reference variable
//		Mix mix=new Mix();				
//		String s=mix.getTitle();
//		System.out.println(mix.getTitle());
//		System.out.println(s);
//		
//		mix.title="new Title";
//		System.out.println(mix.getTitle());
//		System.out.println(s);
//		
//		Mix mix2=new Mix();
//		mix2=mix;
//		System.out.println(mix.getTitle());
//		System.out.println(mix2.getTitle());
//		
//		mix.title="same new title";
//		System.out.println(mix.getTitle());
//		System.out.println(mix2.getTitle());
//	}
//}
