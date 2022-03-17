package day5_mar11_thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class EmpStreamEx1 {

	public static void main(String[] args) {
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(14,"Tarun",28000,"kkd"));
		emplist.add(new Employee(11,"sai",60000,"bang"));
		emplist.add(new Employee(12,"Surya",18000,"hyd"));
		emplist.add(new Employee(10,"Lucky",39000,"vij"));
		
		//extract code from emplist
		List<Integer> codelist = emplist.stream()
				.map(e->e.getEmpCode())
				.collect(Collectors.toList());
		System.out.println(codelist);
		System.out.println("max value = "+Collections.max(codelist));
		System.out.println("min value = "+Collections.min(codelist));
		System.out.println("check for "+codelist.contains(11));
		
		//extract salary from the emplist
		List<Double> salaries =  emplist.stream()
				.filter(f->f.getSalary()>30000)
				.map(s->s.getSalary())
				.collect(Collectors.toList());	
		System.out.println(salaries);
		
		//extract the employee objects whose salary is > 30000
		List<Employee> salaryList =  emplist.stream()
				.filter(f->f.getSalary()>30000)
				.map(m->m)
				.collect(Collectors.toList());	
		System.out.println(salaryList);
		salaryList.forEach((e)-> System.out.println(e));
	}

}
