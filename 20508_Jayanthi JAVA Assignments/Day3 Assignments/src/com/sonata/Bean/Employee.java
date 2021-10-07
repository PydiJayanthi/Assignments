package com.sonata.Bean;

import java.util.List;

public class Employee {
	
	int EmpId;
	String EmpName;
	double Salary;

	Employee(){}
	Employee(int id, String name,double sal){
	this.EmpId=id;
	this.EmpName=name;
	this.Salary=sal;
	}

	public void Tostring() {
	System.out.println(EmpId);
	System.out.println(EmpName);
	System.out.println(Salary);
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

}
