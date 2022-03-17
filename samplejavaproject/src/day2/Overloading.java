package day2;

public class Overloading {
	public void add(int x , int y) {
		System.out.println("int add " + (x+y));
	}
	public void add(double x , double y) {
		System.out.println("double add " + (x+y));
	}
	public void add(String x , String y) {
		System.out.println("String add " + (x+y));
	}
	public void add(float x , float y) {
		System.out.println("float add " + (x+y));
	}

	public static void main(String[] args) {
		Overloading obj = new Overloading();
		//obj.add("Tarun ", "Sai");
		obj.add(15, 12);
		System.out.println(obj);
	}

}
