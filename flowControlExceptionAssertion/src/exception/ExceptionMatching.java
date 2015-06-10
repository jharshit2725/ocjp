package exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ExceptionMatching {
public static void main(String[] args) {
	try{
		RandomAccessFile raf =	new RandomAccessFile("myfile.txt", "r");
	    byte b[] = new byte[1000];
		raf.readFully(b, 0, 1000);
	}catch(Exception e){		
	}
//	catch(FileNotFoundException e){//Not working as already caught by broader IoException
//	}
	
}
}
