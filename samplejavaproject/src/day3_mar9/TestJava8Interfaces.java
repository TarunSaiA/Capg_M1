package day3_mar9;

public class TestJava8Interfaces {

	public static void main(String[] args) {
		Arthimetic arth = (a,b)->{
			System.out.println("with parameters "+a+" "+b);
			return a+b;
		};
		System.out.println("The sum is "+arth.add(15, 20));
		arth.display(6);
		Arthimetic.output();

	}

}
