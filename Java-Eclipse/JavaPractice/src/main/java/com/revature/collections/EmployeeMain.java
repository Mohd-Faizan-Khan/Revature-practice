package com.revature.collections;
import java.util.*;

public class EmployeeMain {
	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		Employee e1 = new Employee("Faizan", 101, 30000.00);
		Employee e2 = new Employee("Ankint", 102, 20000.00);
		Employee e3 = new Employee("Shrey", 103, 15000.00);
		Employee e4 = new Employee("Somnath", 104, 25000.00);
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		Collections.sort(employees);
		for (Iterator iterator = employees.iterator(); iterator.hasNext();) {
			Employee employee = (Employee) iterator.next();
			System.out.println(employee.geteName());
		}
	}
}
