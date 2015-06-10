package conditional;

public class Ternary {

	static int pet = 12;
	
	public static void main(String[] args) {
		String status = pet<11 ? "pet limit fine":"pet limit exceeded";
		System.out.println(status);
	}
}
