package wrapperclassandboxing;

public class ValueofStringPrimitive {
	
	public static void main(String[] args) {
		Double double1= Double.valueOf("1.23");
		System.out.println(double1);
		
		Long long1=Long.valueOf("1.23"); //throwing NFE unable to truncate
		System.out.println(long1);
		
	//	Short short1 = Short.valueOf(1); //cant parse primitive directly without string
		
	}

}
