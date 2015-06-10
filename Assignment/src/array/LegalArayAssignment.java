package array;

public class LegalArayAssignment {

	public static void main(String[] args) {


		int[] ist = new int[4];
		short s=4;
		char c='c';
		ist [0] = s;
		ist [1] = c;

		for(int i:ist){
			System.out.println(i);
		}



		int[] weightList = new int[5];
		byte b = 4;
		char d = 'c';
		short e = 7;
		weightList[0] = b; // OK, byte is smaller than int
		weightList[1] = d; // OK, char is smaller than int
		weightList[5] = e; // OK, short is smaller than int

	}
}
