package Com.Sonata;

public class highCountOfDup {
	public static void main(String [] args)
	{
		int [] array= {1,2,3,4,3,3,4,2,6,5,4,4,3,2,2,1,2,2,9,5,6,7,7,5,3,2};
		int count=0;
		int element=0;
		for(int i=0;i<array.length;i++)
		{
		int counter=1;
		for(int j=i+1;j<array.length;j++)
		{
		if(array[i]==array[j])
		{
		counter++;
		}
		}
		if(count<counter)
		{
		count=counter;
		element=array[i];
		}
		}
		System.out.println("Highest count of a element in the above array is : "+ element );
	}
}
