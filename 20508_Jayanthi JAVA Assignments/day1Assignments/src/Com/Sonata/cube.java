package Com.Sonata;

import java.util.Scanner;

public class cube {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);	
		int num;
		System.out.println("enter a number:");
		num= sc.nextInt();
		int cube=num*num*num;
		System.out.println("cube of the number is :" +cube);
	}

}
