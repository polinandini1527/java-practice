import java.io.*;
import java.lang.*;
import java.util.*;
class Pattern
{
  public static void main(String args[])
  {
    int i,j,n;
	Scanner in=new Scanner(System.in);
	System.out.print("enter n value:");
	n=in.nextInt();
	for(i=0;i<n;i++)
	{
		for(j=n-i;j>1;j--)
		{
			System.out.print(" ");
		}
		for(j=0;j<=i;j++)
		{
		System.out.print("*");
		}
		System.out.println();
	}
}
}