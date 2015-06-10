package synchrinizing;

class Myaccount{
	int balance = 50;

	public int getbalance() {
		return balance;
	}

	public void withdraw(int amount) {
		this.balance = balance-amount;
	}

}

public class AccountDanger implements Runnable{
	private Myaccount myaccount=new Myaccount();

	@Override
	public void run() {

		for (int i = 0; i < 5; i++) {
			makeWithdrawal(10);
			if(myaccount.getbalance()<0){
				System.out.println("Account is overdrawn");
			}
		}		
	}

	private synchronized void makeWithdrawal(int i) {
		if(myaccount.getbalance()>0){
			System.out.println(Thread.currentThread().getName()
					+ " is going to withdraw");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			myaccount.withdraw(i);
			System.out.println(Thread.currentThread().getName()
					+ " completes the withdrawal");
			
		}
		
		else{
			System.out.println("Not enough in account for "
					+ Thread.currentThread().getName()
					+ " to withdraw " + myaccount.getbalance());
			
		}

	}

	public static void main(String[] args) {	
		AccountDanger r=new AccountDanger();		
		Thread t1 = new Thread(r);	
		Thread t2= new Thread(r);
		t1.setName("Fred");
		t2.setName("Lucy");	
		t1.start();
		t2.start();
	}


}



