package exercises;

public class Ex91 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			if(i%10==0){
				System.out.println("10's multiple encountered");
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	
	public static void main(String[] args) {
		Ex91 ex91=new Ex91();
		Thread thread = new Thread(ex91);
		thread.start();
	}

}
