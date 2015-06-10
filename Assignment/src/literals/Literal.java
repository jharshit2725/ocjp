package literals;

public class Literal {
char v;
String string;
	public static void main(String[] args) {

		
		System.out.println("octa-----------");
		int a = 07;
		int A = 07;  //case sensitive java though not always
		int b = 010; //octal
		long lo = 01234567123456712345671l; //octal with highest value
		System.out.println(a);
		System.out.println(b);
		System.out.println(lo);
		
		System.out.println("hexa----------");
		int x = 0x001;  //hexa
		short c = 0x1f;
		long d = 0xd;
		long e = 0xDEADCAFE;
		
		System.out.println(x);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		System.out.println("float/double-----------");
		double f= 0.0000287856873;
		float g=0.4768768976897685327F;
		System.out.println(g);
		System.out.println(f);
		System.out.println(g);
	
		boolean  h=true;
		System.out.println(h);
		
		char i='a';
		char j=9823;
		char k=(char) 121234234;
		char l=010;
		char m=0x1234;
		char n=(char)232424545345l;
		char o='\u004E';
		char p='\u0000';
		char P = '\"';
		System.out.println("*****************char******");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(n);
		System.out.println(o);
		System.out.println(p);
		System.out.println(P);
		
		Thread thread = null;
		System.out.println("******thread*********");
		System.out.println(thread);
		
		byte q=99;
		
		byte Q=1;
		byte r=(byte) 1231423;
		System.out.println(q);
		System.out.println(r);
		
		byte s=34;
		byte t=8;
		byte u=(byte) (s+t); //cast needed
		System.out.println(u);
		
		System.out.println(new Literal().v+"hi");
		System.out.println(new Literal().string);
		
		char v = 11; //able to assign int literal  (< bits)
		short w=1;
		
		int y = 99999;
		byte z=(byte)y;
		
		System.out.println(z);
	}
}
