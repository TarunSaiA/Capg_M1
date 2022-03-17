package day2;

public class Student {
	private int regno;
	private String studentName;
	private int sub1;
	private int sub2;
	private int sub3;
	
	Student(){
		regno = 230;
		studentName = "lucky";
		sub1 = 45;
		sub2 = 65;
		sub3 = 8;
	}
	public Student(int regno, String studentName, int sub1, int sub2, int sub3) {
		this.regno = regno;
		this.studentName = studentName;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	
	
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getSub1() {
		return sub1;
	}
	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}
	public int getSub2() {
		return sub2;
	}
	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}
	public int getSub3() {
		return sub3;
	}
	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	
	
	

}
