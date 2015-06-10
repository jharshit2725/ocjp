package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filewriter {

	public static void main(String[] args) {
		char in[]=new char[50];
		int size;
		File file=new File("hashNewFile.txt");
		try {
			FileWriter writer=new FileWriter(file);		
			writer.write("howdy\nHot\nfolks\n");
			writer.flush();
			writer.close();

			FileReader fr=new FileReader(file);

			size=fr.read(in);
			//	System.out.println(size);
			for(char c:in){
				System.out.print(c);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



	}
}
