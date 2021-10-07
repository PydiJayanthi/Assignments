package com.sonata.ExceptionAssig;

import com.sonata.ExceptionExc.MyException;

public class EmployeeExc {
	
	public static void main(String args[]) throws MyException
	{
	int total=50000;
	if(total<100000)
		throw new MyException("ur not eligible to tax");
	else
		System.out.println("welcome");
	
	}
}
