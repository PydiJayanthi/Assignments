package com.sonata.Bean;

public class Employee1 {
	
	public static void main(String[] args) {

		Employee e1=new Employee();
		e1.setEmpId(123);
		e1.setEmpName("Jayanthi");
		e1.Tostring();
		e1.setSalary(255289);
		//e1.YearSalary();

		Employee e2=new Employee();
		e2.setEmpId(567);
		e2.setEmpName("jay");
		e2.Tostring();
		e2.setSalary(234454);
		//e2.YearSalary();

		EmployeeIm l1=new EmployeeIm();
		l1.addEmployee(e1);
		l1.addEmployee(e2);

		/*System.out.println(l1.getEmployee());
		System.out.println(l1);*/
		}


}
