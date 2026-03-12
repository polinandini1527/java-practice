import java.io.*;
import java.lang.*;
import java.util.*;
class Pattern1
{
  public static void main(String args[])
  {
    int i,j,n;
	Scanner in=new Scanner(System.in);
	System.out.print("enter n value:");
	n=in.nextInt();
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=n-i;j++)
		{
			System.out.print(j+ " ");
		}
		for(j=1;j<=i;j++)
		{
		System.out.print(i+ " ");
		}
		System.out.println();
	}
}
}