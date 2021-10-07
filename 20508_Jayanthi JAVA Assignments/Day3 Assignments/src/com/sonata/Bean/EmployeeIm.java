package com.sonata.Bean;

import java.util.LinkedList;
import java.util.List;

public class EmployeeIm extends Employee implements EmployeeIntf {
	
	List<Employee> l1=new LinkedList<>();

	@Override

	public void addEmployee(Employee e) {

	l1.add(e);
	}

	/*@Override
	public List<Employee> getEmployee(){
	return null;
*/
	@Override
	public void deleteEmployee(Employee e) {


	}

	@Override
	public double YearSalary(Employee e1) {

	if(Salary==1000)
	{
	Salary=5000;
	System.out.println(Salary);
	}
	return 0;
	}

	public double appSalary(Employee e1) {
	return 0;
	}

	@Override
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getEmployee1() {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public  getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}*/


}
