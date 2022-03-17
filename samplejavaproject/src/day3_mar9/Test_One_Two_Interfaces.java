package day3_mar9;

public class Test_One_Two_Interfaces {

	public static void main(String[] args) {
		One obj1 = ()->{
			System.out.println("Im from interface One and i have method1 ");
			System.out.println();
		};
		Two obj2 = ()->{
			System.out.println("Im from interface Two and i have method2");
		};
        
		obj1.method1();
		obj2.method2();
	}

}
