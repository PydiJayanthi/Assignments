package com.sonata.inheritance;

public class MyOwnAutoShopProject {
	public static void main(String args[])
	{
		Sedan s2=new Sedan();
		s2.speed=100;
		s2.regularPrice=243557;
		s2.color="white";
		s2.getSalePrice();
		s2.display();
		
		Ford f=new Ford();
		f.speed=90;
		f.regularPrice=565332;
		f.year=2018;
		f.color="blue";
		f.manDiscount=10;
		f.getSalePrice();
		f.display();
		
		Car c=new Car();
		c.speed=70;
		c.regularPrice=859489;
		c.color="black";
		}

}
