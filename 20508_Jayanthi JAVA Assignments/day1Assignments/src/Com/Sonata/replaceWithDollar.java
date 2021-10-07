package Com.Sonata;
import java.util.*;

public class replaceWithDollar {
	public static void main(String args[])
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String str=s;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if((c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U')||(c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
{
	String Actstr=s.substring(0,i);
	String Dolstr=s.substring(i+1);
	s=Actstr+ "$"+Dolstr;
}
		}
		System.out.println(str);
		System.out.println(s);
		}

}
