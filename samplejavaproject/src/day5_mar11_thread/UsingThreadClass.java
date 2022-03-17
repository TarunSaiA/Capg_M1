package day5_mar11_thread;

public class UsingThreadClass extends Thread {
	public void run() {
		System.out.println(Thread.currentThread());
		for(int i=1;i<=6;i++)
			System.out.print(i+" ");
	}
	public static void main(String[] args) {
		UsingThreadClass t1 = new UsingThreadClass();
		UsingThreadClass t2 = new UsingThreadClass();
		UsingThreadClass t3 = new UsingThreadClass();
		
		t1.start();
		t2.start();
		t3.start();
	}
        
}
