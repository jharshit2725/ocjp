package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
	private transient Collar theCollar;
	private int dogSize;
	public Dog(Collar collar, int size) {
		theCollar = collar;
		dogSize = size;
	}
	public Collar getCollar() { return theCollar; }
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Collar collar=new Collar(10);
		Dog dog=new Dog(collar, 20);
		System.out.println("Before");
		   System.out.println(dog.getCollar().getCollarSize());
		    System.out.println(dog.dogSize);
		FileOutputStream fs=new FileOutputStream("DogSer.ser");
	    ObjectOutputStream os=new ObjectOutputStream(fs);
	    os.writeObject(dog);
	    os.close();
	    
	    FileInputStream fis=new FileInputStream("DogSer.ser");
	    ObjectInputStream is=new ObjectInputStream(fis);
	    Dog d1=(Dog) is.readObject();
	    is.close();
	    System.out.println("After");
	    System.out.println(d1.getCollar().getCollarSize());
	    System.out.println(d1.dogSize);
	    
		
	}
}
class Collar implements Serializable {
	private int collarSize;
	public Collar(int size) { collarSize = size; }
	public int getCollarSize() { return collarSize; }
}