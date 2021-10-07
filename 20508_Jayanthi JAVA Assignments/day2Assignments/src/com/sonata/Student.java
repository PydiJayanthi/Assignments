package com.sonata;

public class Student
{
	int StdId;
	String StdName;
	int StdCls;
	Student(int id,String name,int cls)
	{
		this.StdId=id;
		this.StdName=name;
		this.StdCls=cls;
	}
public void display()
{
	System.out.println(StdId);
	System.out.println(StdName);
	System.out.println(StdCls);
}
public static void main(String args[])
{
	Student s1=new Student(20508,"jayanthi",28);
	s1.display();
	Student s2=new Student(20,"jayanthi",8);
	s2.display();
}
}
