package defining;

public class MyThread extends Thread {
public void run(){
	System.out.println("important job running");
}

public static void main(String[] args) {
	MyThread thread=new MyThread();
	System.out.println(Thread.currentThread().getName());
}
}
