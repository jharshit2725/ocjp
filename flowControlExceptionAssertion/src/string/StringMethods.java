package string;

public class StringMethods {

	public static void main(String[] args) {
		String s = "aeroplane";
		System.out.println(s.charAt(4));
		
		String s1="ExiT";
		System.out.println(s1.equalsIgnoreCase("EXIT"));
		
		String s2 = "HarshitJain";
		System.out.println(s2.length());
		
		String s3 = "Ranjusha Sasidharan";
		System.out.println(s3.substring(9));
		System.out.println(s3.substring(0,10));
		
		String s4 = "0123456789";
		System.out.println(s4.substring(4));
		System.out.println(s4.substring(5,9));
		
		String s5 = "A NEw MOON";
		System.out.println(s5.toLowerCase().substring(6));
		
		String s6 = "       Hi          ";
		System.out.println(s6+'x');
		System.out.println(s6.trim()+'x');
	}
}
