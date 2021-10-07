package Com.Sonata;

import java.util.*;
public class arSpecificValue {
	public static void main(String[] args) {
		int n,c=0;
		int[] array= {1,2,3,4,5,6};
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<array.length;i++)
		{
		if(n==array[i])
		{
		System.out.println("The number is present in the Array");
		c++;
		break;
		}
		}
		if(c==0)
		{
		System.out.println("The number is not there in the array");
		}
	}

}
