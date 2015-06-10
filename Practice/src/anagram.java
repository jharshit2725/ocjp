import java.util.Arrays;


public class anagram {

	private static char c;

	public static void main(String[] args) {
		char[] cs1= new char[] {'b','a','l','l'};
		char[] cs2= new char[] {'l','a','l','b'};

		cs1 = bubbleSort(cs1);
		cs2 = bubbleSort(cs2);
		if(Arrays.equals(cs1, cs2)){
			System.out.println("its anagram");
		}
		else
			System.out.println("not anagram");
	}

	public static char[] bubbleSort(char[] cs){

		for(int i=0;i<cs.length;i++){
			for(int k=0;k<cs.length-1;k++){
				if(cs[k]>cs[k+1]){
					c=cs[k];
					cs[k]=cs[k+1];
					cs[k+1]=c;
				}
			}			
		}
		//display
		for(int j=0;j<cs.length;j++){
			System.out.println(cs[j]);
		}
		return cs;
	}
}
