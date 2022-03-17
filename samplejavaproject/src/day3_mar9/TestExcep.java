package day3_mar9;

public class TestExcep {

	public static void main(String[] args) {
		int x =6;
		int y = 0;
		int arr[] = {1,2,3,4,5,6,7};
		try {
			int z = x/y;
			System.out.println("Z is "+z);
			System.out.println("The array element is "+arr[39]);
		}
		catch(ArrayIndexOutOfBoundsException | ArithmeticException  e  ) {
			e.printStackTrace();
		}
		System.out.println("Success");
	}

}
