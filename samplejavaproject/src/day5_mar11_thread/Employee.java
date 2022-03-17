package day5_mar11_thread;

public class Employee {
	private int empCode ;
	private String name;
	private double salary;
	private String city;
	
	public Employee(int empCode, String name, double salary, String city) {
		super();
		this.empCode = empCode;
		this.name = name;
		this.salary = salary;
		this.city = city;
		
	
	}

	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}

	public int getEmpCode() {
		return empCode;
	}

	public void setEmpCode(int empCode) {
		this.empCode = empCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	

}
