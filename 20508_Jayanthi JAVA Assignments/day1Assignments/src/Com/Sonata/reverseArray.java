package Com.Sonata;

public class reverseArray {
	public static void main(String [] args) {
		int[] array= {1,2,3,4,5};
		System.out.println("Reverse of an array is:");
		for(int i=array.length-1;i>=0;i--)
		{
		System.out.println(array[i]);
		}
}
}