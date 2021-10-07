
package com.sonata.inheritance;

public class Car {

		int speed;
		double regularPrice;
	    String color; 

   Car(){}
   Car(int sp,double rprice,String col){
	   this.speed=sp;
	   this.regularPrice=rprice;
	   this.color=col;
	   
   }
   public void getSalePrice()
   {
	   System.out.println(regularPrice);
   }
   public void display()
   {
	   
	   System.out.println(speed);
	   System.out.println(regularPrice);
	   System.out.println(color);
   }
   
   
  

}
