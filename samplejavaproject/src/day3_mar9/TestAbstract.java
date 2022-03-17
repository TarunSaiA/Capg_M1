package day3_mar9;

abstract class SampleAb {
	int x;
	int y;
	public SampleAb() {
		x=10;
		y=50;
	}
	void display() {
		System.out.println(x+y);
	}
	abstract void output();
}

public class TestAbstract extends SampleAb{
	public static void main(String[] args) {
		TestAbstract test = new TestAbstract();
		test.display();
		test.output();

	}

	@Override
	void output() {
		System.out.println("This is an abstract calss");
		
	}


}
