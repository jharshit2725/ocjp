import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Dog implements Serializable{
	Collar collar;
	int dogSize;
	public int getDogSize() {
		return dogSize;
	}

	public Dog(Collar collar, int size){
		this.collar=collar;
		dogSize=size;
	}

	public static void main(String[] args) {
		Collar collar=new Collar(10);
		Dog dog=new Dog(collar, 20);
		System.out.println(dog.getDogSize());
		
		try{
			FileOutputStream fs=new FileOutputStream("Dog.ser");
			ObjectOutputStream os=new ObjectOutputStream(fs);
			os.writeObject(dog);
			os.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

class Collar implements Serializable{
	int collarSize;
	Collar(int size){
		this.collarSize = size;
	}
	public int GetCollarSize(){
		return collarSize;
	}
}

