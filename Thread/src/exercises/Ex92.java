package exercises;

public class Ex92 implements Runnable {

	private StringBuffer buffer = new StringBuffer("A");

	@Override
	public void run() {
		doStuff();		
	}
	
	public synchronized void doStuff() {
		for (int i = 0; i < 100; i++) {
			System.out.println(buffer);
		}
		String string = buffer.toString();
		char ch= string.charAt(0);		
		buffer.setCharAt(0, ++ch);
	}

	public static void main(String[] args) {
		Ex92 ex92=new Ex92();
		Thread t1 = new Thread(ex92);
		Thread t2 = new Thread(ex92);
		Thread t3 = new Thread(ex92);
		t1.start();
		t2.start();
		t3.start();
	}

}
