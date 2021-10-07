package Com.Sonata;

public class greatestNum {
public static void main(String args[])
{
	int a=12,b=25,c=89;
	if(a>b&&a>c)
		System.out.println("greatest num is:" +a);
	else if(b>a&&b>c)
		System.out.println("greatest num is:" +b);
	else if(c>a&&c>b)
	System.out.println("greatest num is:" +c);
	else
		System.out.println("numbers are equal");
}
}
