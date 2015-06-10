package file;

import java.io.File;
import java.io.IOException;

public class Writer1 {

	public static void main(String[] args) throws IOException {
	//	try{
			
		File file=new File("hashJavaFile.txt");
		System.out.println(file.exists());
		boolean newFile = file.createNewFile();
		System.out.println(newFile);
		System.out.println(file.exists());
		
		
	//	}catch(IOException e){	}
		
	}
}
