package wrapperclassandboxing;

public class WrapperConstructor {

	public static void main(String[] args) {
		// Assigning Values
		Integer integer = new Integer("42");
		Integer integer2 = new Integer(42);
		System.out.println(integer+" "+integer2);
		
		Boolean boolean1=new Boolean(false);
		Boolean boolean2=new Boolean("tru"); //everything else apart from "true" giving false output
		System.out.println(boolean1+" "+boolean2);
		
		Float float1=new Float(31.223424545);		
		Float float2=new Float("31.2");
		System.out.println(float1+" "+float2);
		
		Double e=Double.valueOf("3.14");
		System.out.println(e);
		System.out.println(e instanceof Double);
		
		Float float3=Float.valueOf("3.141");
		Integer integer3=Integer.valueOf("101",2);
		System.out.println(float3+" "+integer3);
	}
}
