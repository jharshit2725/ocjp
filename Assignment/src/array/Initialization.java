package array;

public class Initialization {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		System.out.println(a[1]);
		
		int[] b;
		b = new int[]{4,5,6};
		System.out.println(b[1]);
		
		b = new int[]{7,8,9,10};
		System.out.println(b[1]);
		
		b = new int[4];
		System.out.println(b[1]);
		
		b = new int[]{7,'a',9,10};
		System.out.println(b[1]);
		
		int[] c=new int[7];
		System.out.println(c[0]);
		
		Initialization [] d = new Initialization[5];
		System.out.println(d[0]);
	//	b=new char[10]; //  error
	//	b=new short[10]; //  error
	}
}
