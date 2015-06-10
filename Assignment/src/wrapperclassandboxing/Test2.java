package wrapperclassandboxing;

public class Test2 {
	public static void main(String[] args) {


		//Value of
		Integer integer3=Integer.valueOf("0123abcd", 16);
		System.out.println(integer3+" "+integer3);

		Float float1=new Float("3.14f");
		System.out.println("float1"+float1);

		Integer integer4 = Integer.valueOf("314");
		System.out.println("integer4"+integer4);

		Short short4 = Short.valueOf("314");
		System.out.println("short4"+short4);

		Double double3 = Double.valueOf("3.932849237849823740000003243414");
		System.out.println("double3"+double3);	

		Float float3 = Float.valueOf("3.932849237849823740000003243414");
		System.out.println("float3"+float3);	

		//****value
		Integer integer=new Integer("42");

		float f=integer.floatValue();
		System.out.println("floatValue"+f);	
		double d=integer.doubleValue();
		System.out.println("doubleValue"+d);	
		short s=integer.shortValue();
		System.out.println("shortValue"+s);
		byte b=integer.byteValue();
		System.out.println("byteValue"+b);

		//parse****
		double double1= Double.parseDouble("3.14");		
		System.out.println(double1);	
		long l=Long.parseLong("101", 2);
		System.out.println(l);
	}
}
