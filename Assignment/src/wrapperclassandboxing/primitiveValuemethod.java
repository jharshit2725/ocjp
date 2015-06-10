package wrapperclassandboxing;

public class primitiveValuemethod {

	public static void main(String[] args) {
		
	Integer integer=new Integer(42);	
	short s=(short) integer.longValue();
	System.out.println(s);
	double d=integer.doubleValue();
	byte b=integer.byteValue();
	System.out.println(d);
	System.out.println(b);
	
	Float float1=new Float(3.14f);
	short s1 = float1.shortValue();	
	System.out.println(s1); //truncate done
	
	Integer i = new Integer(10);
	float f = i.floatValue();
	System.out.println("********");
	System.out.println(f);
	
//	Byte byte1=new Byte("1");
//	System.out.println(byte1);
//	
//	Byte byte2 = byte1.byteValue();
//	System.out.println(byte2);	
//	
//	Double double1=(double) byte1.byteValue();
//	System.out.println(double1);
//	
//	Float float2 = (float) byte1.byteValue();
//	System.out.println(float2);
//	
//	Long long1 = (long) byte1.byteValue();
//	System.out.println(long1);
//	
//	Short short1=(short) byte1.byteValue();
//	System.out.println(short1);
	
	
	Double double1=new Double("1.12");
	System.out.println(double1);
	
	Byte byte2 = double1.byteValue();
	System.out.println(byte2);	
	
	Double double2=(double) double1.byteValue();
	System.out.println(double2);
	
	Float float2 = (float) double1.byteValue();
	System.out.println(float2);
	
	Long long1 = (long) double1.byteValue();
	System.out.println(long1);
	
	Short short1=(short) double1.byteValue();
	System.out.println(short1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}	
}
