package com.sonata;

public class Rectangle extends Shape {

	Rectangle(int length ,int height,int width){

		super();

		}

		public double Radius(int length,int width) {

		double R=2*(length*width);
		System.out.println("Radius="+R);
		return 0;
		}

		public static void main(String[] args) {
		Rectangle r1=new Rectangle(4, 8, 9);
		r1.length=20;
		r1.height=20;
		r1.width=10;
		r1.Radius(10, 20);
		}


		}


