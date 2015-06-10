
public class FindingRepetitionsInString {

	public static void main(String[] args) {
		String s="abbcccdddd";
		int temp=0;
		String finalString="";
		for(int j=0;j<s.length();j++){
			if(!(finalString.contains(String.valueOf(s.charAt(j))))){
				finalString+=s.charAt(j);
				temp=0;
				for(int i=j;i<s.length();i++){     
					if(s.charAt(i)==s.charAt(j)){
						temp++;
					}
				}
				finalString+=temp;
			}   
		}
		System.out.println(finalString);
	}

}
