import java.util.*;
import java.lang.*;
import java.io.*;
public class Repeated_k
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int count,temp;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			count=1;
			for(int j=i;j<n;j++)
			{
				if(a[i]==a[j]&&i!=j&&a[i]!=-1)
				{
					count++;
					
					a[j]=-1;
					
				}
			}
			if(count<k&&a[i]!=-1)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}
