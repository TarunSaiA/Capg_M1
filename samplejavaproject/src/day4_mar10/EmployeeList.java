package day4_mar10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeList {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int inputValue;
		ArrayList<Employee> emplis=new ArrayList<>();
		
		emplis.add(new Employee(121,"tarun",5000));
		emplis.add(new Employee(101,"lucky",4000));
		emplis.add(new Employee(131,"sk",3000));
		emplis.add(new Employee(161,"hari",6000));
		
		do {
			System.out.println("Enter 1 to sort details based on code");
			System.out.println("Enter 2 to sort details based on name");
			System.out.println("Enter 3 to sort details based on Salary in ascending order");
			System.out.println("Enter 4 to sort details based on Salary in descending order");
			System.out.println("Enter 5 to exit");
			System.out.println();
			
			inputValue=sc.nextInt();
			switch(inputValue)
			{
			case 1:
				{
				 Collections.sort(emplis,new SortByCode());
				 emplis.forEach((e)-> System.out.println(e.getCode()+" "+e.getName()+" "+e.getSalary()));
				 break;
				}
			case 2:
			{
			 Collections.sort(emplis,new SortByName());
			 emplis.forEach((e)-> System.out.println(e.getCode()+" "+e.getName()+" "+e.getSalary()));
			 break;
			}
			case 3:
			{
			 Collections.sort(emplis,new SortBySalaryAsc());
			 emplis.forEach((e)-> System.out.println(e.getCode()+" "+e.getName()+" "+e.getSalary()));
			 break;
			}
			case 4:
			{
			 Collections.sort(emplis,new SortBySalaryDesc());
			 emplis.forEach((e)-> System.out.println(e.getCode()+" "+e.getName()+" "+e.getSalary()));
			 break;
			}
			case 5:
			{
			 System.out.println("Exit successful");
			 
			}
			}
			
		}while(inputValue!=5);
		
		sc.close();
	}

	

}