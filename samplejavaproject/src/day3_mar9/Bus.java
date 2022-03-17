package day3_mar9;

public class Bus implements Wheels {

	@Override
	public void engines() {
		System.out.println("The Bus has 1 engine.");
		
	}

	@Override
	public void wheels() {
		System.out.println("The Bus has 6 wheels.");
	}
	
	public static void main(String[] args) {
		Bus obj = new Bus();
		obj.engines();
        obj.wheels();
}}
