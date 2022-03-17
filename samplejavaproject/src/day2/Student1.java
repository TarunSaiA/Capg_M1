package day2;

public class Student1 {
	protected int regno;
	protected String name;
	protected String group;
	
	
	public Student1(int regno, String name, String group) {
		this.regno = regno;
		this.name = name;
		this.group = group;
	}
	
	void display() {
		System.out.print(regno+" " + name + " "+group);
	}
	
	

}
