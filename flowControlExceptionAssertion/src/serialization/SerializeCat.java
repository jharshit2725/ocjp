package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Cat implements Serializable{
	
}
public class SerializeCat {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Cat c=new Cat();
		FileOutputStream fs=new FileOutputStream("catSer.ser");
	    ObjectOutputStream os=new ObjectOutputStream(fs);
	    os.writeObject(c);
	    os.close();
	    
	    FileInputStream fis=new FileInputStream("catSer.ser");
	    ObjectInputStream is=new ObjectInputStream(fis);
	    Cat c1=(Cat) is.readObject();
	    is.close();
	    
	    System.out.println(c==c1);
	    System.out.println(c.equals(c1));
	    
	}
}
