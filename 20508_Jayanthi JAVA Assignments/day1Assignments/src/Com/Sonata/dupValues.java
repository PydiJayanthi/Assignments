package Com.Sonata;

public class dupValues {
	public static void main(String [] args) {
		int [] array=new int[] {1,2,3,3,5,6,6,0,9,2,4,0};
		System.out.println("Duplicate values in the array are :");
		for(int i=0;i<array.length;i++)
		{
		for(int j=i+1;j<array.length;j++)
		{
		if(array[i]==array[j])
		{
		System.out.println(array[j]);
		}
		}
		}

	}
}
