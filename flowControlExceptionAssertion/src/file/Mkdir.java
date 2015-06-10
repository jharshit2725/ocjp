package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Mkdir {

	public static void main(String[] args) throws IOException  {
		char in[]=new char[50];
		int size;
		File mkdir=new File("hashNewDirs");
		//mkdir.mkdir();
		
		File myFile = new File(mkdir, "hashNewFile");	
	
		myFile.createNewFile();
			PrintWriter pw =new PrintWriter(myFile);
			pw.write("doStuff");
			pw.flush();
		
		System.out.println("yuhu");
		
		
		
	}
	
}
