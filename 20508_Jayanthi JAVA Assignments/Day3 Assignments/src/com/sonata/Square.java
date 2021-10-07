package com.sonata;

public class Square extends Shape{
	Square(){}
	Square(int length , int height,int width){

	super(length,height,width);

	}
	@Override

	public double Radius(int length,int height) {

	double k=(1/2)*height;
	double h=(k*k)*2;
	// double R=sqrt(h);
	System.out.println("Radius="+h);
	return 0;
	}
	public static void main(String[] args) {

	Square s1=new Square();
	s1.Radius(10, 20);
	}


}
