package list;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class ArrayLists {
	public static void main(String[] args) {
		List<String> test=new ArrayList<String>();

		test.add("Hi");
		test.add("Hi"+"Hi");

		System.out.println(test.size());
		System.out.println(test.contains(42));

		test.remove("Hi");
		System.out.println(test.size());

		test.add("Miranda");
		test.add("Heer");
		test.add("Arya");
		test.add("Anisha");
		System.out.println(test);

		Collections.sort(test);
		System.out.println(test);

		String s= "shyam";
		System.out.println(s.compareTo("tam"));

	}
}
