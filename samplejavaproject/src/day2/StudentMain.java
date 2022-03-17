package day2;

public class StudentMain {

	public static void main(String[] args) {
	  // Student s1 = new Student(); without args
		Student s1 = new Student(220,"Tarun",45,65,87); //with args
		
//		s1.setRegno(Integer.parseInt(args[0]));
//		s1.setStudentName(args[1]);
//		s1.setSub1(Integer.parseInt(args[2]));
//		s1.setSub2(Integer.parseInt(args[3]));
//		s1.setSub3(Integer.parseInt(args[4]));
		
		int total = s1.getSub1()+s1.getSub2()+s1.getSub3();
		int average = total/3;
		
		if(s1.getSub1()>=40 && s1.getSub2()>=40 && s1.getSub3()>=40) {
			if(average>=60) {
				System.out.println("regno "+ s1.getRegno() +" student name " + s1.getStudentName() + " total marks " + total + " average " + average + "  first grade" );
			}
			else if(average>=50) {
				System.out.println("regno "+ s1.getRegno() +" student name " + s1.getStudentName() + " total marks " + total + " average " + average + "  second grade" );
			}
			else {
				System.out.println("regno "+ s1.getRegno() +" student name " + s1.getStudentName() + " total marks " + total + " avearge " + average + "  third grade" );
			}}
		else {
			System.out.println("regno "+ s1.getRegno() +" student name " + s1.getStudentName() + " is failed");
		}
			
		}
		

	}


