package string;

public class Immmutability {

	public static void main(String[] args) {
		String s = new String();
		s = "Java";
		System.out.println(s);
		s.concat("Rules");
		System.out.println(s);
		s.replace('a', 'X');
		System.out.println(s);
		s.toUpperCase();
		System.out.println(s);
		
		s=s.concat("Rules");
		System.out.println(s);
		s=s.replace('a', 'X');
		System.out.println(s);
		s=s.toUpperCase();
		System.out.println(s);
	}
}
