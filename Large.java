import java.util.*;
import java.lang.*;
import java.io.*;
public class Large
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<n;i++)
		{
			if(a[i-1]>a[i])
			{
				System.out.println(a[i-1]);
				i=n;
			}
		}
	}
}
