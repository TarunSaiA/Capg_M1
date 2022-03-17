package day5_mar11_thread;

public class ReservationAppln {

	public static void main(String[] args) {
		BirthReservation b1 = new BirthReservation();
		Thread t1 = new Thread(b1);
		t1.setName("Tarun Sai");
		t1.start();
		
		Thread t2 = new Thread(b1);
		t2.setName("Lucky");
		t2.start();
		
		Thread t3 = new Thread(b1);
		t3.setName("Sk");
		t3.start();
        
		Thread t4 = new Thread(b1);
		t4.setName("Rk");
		t4.start();

	}

}
