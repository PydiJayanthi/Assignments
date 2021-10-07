package com.sonata;

public class Product {
	
	int ProID;
	String ProName;
	double ProPrice;
	Product(int id,String name,double price)
	{
		this.ProID=id;
		this.ProName=name;
		this.ProPrice=price;
	}
	public void display() {
		
	System.out.println(ProID);
	System.out.println(ProName);
	System.out.println(ProPrice);
	}
	
	public static void main(String args[])
	{
		Product p1=new Product(2334,"phone",243545+680);
		p1.display();
	}

}
