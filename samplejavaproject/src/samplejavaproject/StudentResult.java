package samplejavaproject;

public class StudentResult {

	public static void main(String[] args) {
		int regNo,sub1,sub2,sub3;
		regNo = 10;
		sub1 = 45;
		sub2 = 55 ;
		sub3 = 30;
		int total = sub1+sub2+sub3;
		int average = total/3;
		if(sub1>=40 && sub2>=40 && sub3>=40)
			System.out.println(regNo + "is Passed");
		else
			System.out.println(regNo + " is Failed");
			
		
		

	}

}
