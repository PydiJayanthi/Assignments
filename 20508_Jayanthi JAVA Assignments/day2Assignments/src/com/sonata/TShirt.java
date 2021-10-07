package com.sonata;

public class TShirt {

	String Color;
	String Material;
	String Design;
	TShirt(String color,String material,String design)
	{
		this.Color=color;
		this.Material=material;
		this.Design=design;
	}
	public void display() {
		
	System.out.println(Color);
	System.out.println(Material);
	System.out.println(Design);
	}
	
	public static void main(String args[])
	{
		TShirt t1=new TShirt("blue","small","chudi");
		t1.display();
		TShirt t2=new TShirt("green","large","longfrock");
		t2.display();
		TShirt t3=new TShirt("red","Xtra-large","top");
		t3.display();
	}

}
