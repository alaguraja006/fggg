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
		String s=in.nextLine();
		StringTokenizer t=new StringTokenizer(s," ");
		System.out.println(t.countTokens());
	}
}
