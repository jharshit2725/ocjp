package multiple;

public class multiple implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<4;i++){
			System.out.println("running important method");
			System.out.println("name of thread is "+Thread.currentThread().getName()+" with thread number "+i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}	
	}


	public static void main(String[] args) throws Exception {
		multiple multiple=new multiple();	
		Thread one=new Thread(multiple);
		one.setName("Fred");
		Thread two=new Thread(multiple);	
		two.setName("Lucy");
		Thread three=new Thread(multiple);
		three.setName("Ricky");
		one.start();
		two.start();
		three.start();
		
	}


	

}
