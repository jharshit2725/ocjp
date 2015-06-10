package exercise;

public class E31 {
	public static void main(String[] args) {
	
		double f=1.23249809798723469803246502394856023984672398670932863456;
		short s=(short) f;
		System.out.println(f);;
		System.out.println(s);
		
		byte b=7;
		// b = (b+3); giving error as its and expression and adding int to byte variable
		b=(byte) (b+3);
		b+=321490823; 
		//no error The compound assignment operator += lets you add to the value of b, without
		//putting in an explicit cast. In fact, +=, -=, *=, and /= will all put in an implicit cast.
		b+=1242342342;
		System.out.println(b);
	}
	
}
