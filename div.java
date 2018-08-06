import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		char c=sc.next().charAt(0);
		int b=sc.nextInt();
		switch(c)
		{
			case '/':int res=a/b;
			System.out.println(res);
			break;
			case '%' :res=a%b;
			System.out.println(res);
			break;
		}
	}
}
