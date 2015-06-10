
public class PassingAnonymousArray {

	public static void main(String[] args) {
		PassingAnonymousArray pa= new PassingAnonymousArray();
		pa.doStuff(new int[]{1,2,3});
	}
	
	public void doStuff(int[] ar){
		System.out.println(ar[0]+""+ar[1]+""+ar[2]);
	}
}
