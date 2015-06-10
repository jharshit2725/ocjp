package file;

import java.io.File;
import java.io.IOException;

public class DirectoryOperation {
	public static void main(String[] args) throws IOException {
		File file=new File("DirectoryForOperations");
		System.out.println(file.isDirectory());
		file.mkdir();
		System.out.println(file.isDirectory());
        File file2=new File(file, "hashFIle1");
        file2.createNewFile();
       // file2.delete();
     
        System.out.println(file.isDirectory());
        File file3=new File(file, "hashFIle2");
        file3.createNewFile();        
       // file3.delete();
        
        File file4=new File("DirectoryForOperationsNewName");
        file.renameTo(file4);
        
        System.out.println(file4.delete());
        
        String[] files=new String[50];
     //   File file5=new File("DirectoryForOperationsNewName");
        File file5=new File("src");
        files = file5.list();
        
        for(String f:files){
        	System.out.println("name: "+f);
        	
        }
        
        
        
        
	}
}
