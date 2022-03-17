package day5_mar11_thread;

import java.util.Scanner;

public class BirthReservation implements Runnable {

	Scanner sc = new Scanner(System.in);
	int available = 10;
	int reqBerths;
	@Override
	public synchronized void  run() {
		if(available!=0) {
			System.out.println("Welcome "+Thread.currentThread().getName()+"!!! "+"Available births = "+available);
			System.out.println("Enter required berths :");
			reqBerths = sc.nextInt();
			available -= reqBerths  ;
			System.out.println(reqBerths + " allocated to "+Thread.currentThread().getName()) ;
		}
		else System.out.println("Welcome "+Thread.currentThread().getName()+" !!! No berths available");
			
			
	}

}
