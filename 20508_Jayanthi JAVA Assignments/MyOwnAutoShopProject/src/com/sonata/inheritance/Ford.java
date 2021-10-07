package com.sonata.inheritance;

public class Ford extends Car  {
	int year;
	int manDiscount;
	int cost;
	Ford(){}
	Ford(int s,double r,String c)
	{
		super(s,r,c);
	}
	public void getSalePrice()
	{
		System.out.println(regularPrice-manDiscount);
	}
	public void display() {
		System.out.println(year);
	}
	public static void main(String args[])
	{
		Ford f1=new Ford();
		f1.display();
		f1.year=2000;
		//f1.manDisount=20;
	//	f1.Color=blue;
	}

}
