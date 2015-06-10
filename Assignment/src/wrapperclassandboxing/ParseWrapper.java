package wrapperclassandboxing;

public class ParseWrapper {
public static void main(String[] args) {
	String s = "42.12";
	double d= Integer.parseInt(s);
	System.out.println(s);
	
//	double double2= Double.parseDouble(3.14);	can be used to parse only string
	
	double double1= Double.parseDouble("3.14");		
	System.out.println(double1);
	
	long l=Long.parseLong("101", 2);
	System.out.println(l);
	
	String string=Long.toString(254, 16);
	System.out.println(string);
}
}
