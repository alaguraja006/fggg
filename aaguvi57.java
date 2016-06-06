/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
					}
					int sum=0;
					for(int i=0;i<n;i++)
					{
						if(i%2==0)
						{
						sum=sum+(int)Math.pow(a[i],3);
					//	System.out.println(Math.pow(a[i],2));
						}else{
							
								sum=sum+(int)Math.pow(a[i],2);
							//System.out.println(Math.pow(a[i],3));
						}
					}
					System.out.println(sum);
	}
}
