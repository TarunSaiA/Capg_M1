package day5_mar11_thread;

public class WaitNotifyExample {
      public static void main(String[] args) {
    	  Transactions tran = new Transactions();
    	  Thread t1 = new Thread(){public void run() {tran.withdraw(7000);}};
          Thread t2 = new Thread(){public void run() {tran.deposit(5000);}};
          t1.start();
          t2.start();
      }
}
