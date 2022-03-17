package day5_mar11_thread;

public class Numbers implements Runnable{

	@Override
	public synchronized void run() {
          	System.out.println(Thread.currentThread());
          	//System.out.println(Thread.currentThread().getName());
          	for(int i=1;i<=6;i++)
          		System.out.print(i+" ");
          	try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}
