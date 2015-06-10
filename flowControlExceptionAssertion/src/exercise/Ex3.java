package exercise;

public class Ex3 {


	public static void main(String[] args) {

		String s = "";
		String string="";
		try{
			string= reverse(s);
		}catch(Exception e){
		//	e.printStackTrace();
		//	System.out.println("caught exception: "+e);
		
		}
		finally{
			System.out.println("the program is completed with string"+string);
			
		}
		System.out.println("hi");
	}

	static String reverse(String st) throws Exception{
		if(st.length()==0){
			throw new Exception();
		}
		else{
			String [] strings = st.split("");
			System.out.println(strings[0]+strings[1]+strings[2]);
			return strings[2]+strings[1];
		}
	}

}
