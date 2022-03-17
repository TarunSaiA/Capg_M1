package day4_mar10;

import java.util.Comparator;

public class SortByCode implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getCode()-o2.getCode();
	}

}
