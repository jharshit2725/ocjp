package defining;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("running important method");
		System.out.println("running "+Thread.currentThread().getName());
		
	}
public static void main(String[] args) {
	MyRunnable nr=new MyRunnable();
	Thread t=new Thread(nr);
	t.setName("fred");
	t.start();
}
}
