package day5_mar11_thread;

public class Transactions {
     int available = 5000;
     synchronized void withdraw(int amount) {
    	 System.out.println("Availabale balance = "+this.available);
    	 System.out.println("Trying to withdraw .... "+amount);
    	 if(this.available<amount) {
    		 System.out.println("Less balance; waiting for deposit...");
    		 
    		 try {
    			 wait();
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
    	 }
    	 this.available -= amount;
    	 System.out.println("withdraw is completed ... balance is : "+this.available);
    	 
     }
     synchronized void deposit(int amount) {
    	 System.out.println("Trying to deposit .... "+amount);
    	 this.available += amount;
    	 
    	 System.out.println("deposit is completed ... balance is : "+this.available);
    	 notify();
     }
}
