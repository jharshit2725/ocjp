package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWrter {
public static void main(String[] args) throws IOException {
	File file=new File("PrintWrter1");
//	FileWriter fw=new FileWriter(file);
//	PrintWriter pw=new PrintWriter(fw);
//	pw.println("hi");
//	pw.println("howdy");
//	pw.flush();
	FileReader fr=new FileReader(file);
	BufferedReader br = new BufferedReader(fr);
	
	System.out.print(br.readLine());
	for(int i=1;i<34;i++)
	{
		System.out.print(","+br.readLine());
	
	}

	
	
}
}
