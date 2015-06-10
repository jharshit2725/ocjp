
public class Test3 {
	static Test3 test1;
	
	public static void main(String[] args) {
		Test3 test2;
		doStuff(test1);//unitialized intance ref variable not giving error
		//doStuff(test2);//unitialized local ref variable giving error
	}

	private static void doStuff(Test3 test3) {
		// TODO Auto-generated method stub
		
	}
}
