package day3_mar9;

public class TestInterfaces implements Three {

	public static void main(String[] args) {
		TestInterfaces test = new TestInterfaces();
		test.method1();
		System.out.println(One.x);
		test.method2();
		test.method3();
		

	}

	@Override
	public void method2() {
		System.out.println("I'm from method 2");
		
	}

	@Override
	public void method1() {
		System.out.println("I'm from method 1");
		
	}

	@Override
	public void method3() {
		System.out.println("I'm from method 3");
		
	}

}
