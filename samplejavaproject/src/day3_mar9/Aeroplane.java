package day3_mar9;

public class Aeroplane implements Wheels{

	@Override
	public void engines() {
		System.out.println("The Bus has 2 engines.");
		
	}

	@Override
	public void wheels() {
		System.out.println("The Bus has 10 wheels.");
		
	}
	
	public static void main(String[] args) {
		Aeroplane obj = new Aeroplane();
		obj.engines();
        obj.wheels();

}}
