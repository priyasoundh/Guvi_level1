import java.math.*;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Previous_div
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
			if(a[i]%a[i-1]==0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}
