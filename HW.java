import java.io.*;
import java.lang.*;
class Pattern
{
  public static void main(String args[])
  {
    int i,j,n;
	Scanner in=new Scanner(System.in);
	System.out.print("enter n value:");
	n=input.nextInt();
	for(i=0;i<=n;i++)
	{
		for(j=0;j<=n-i;j++)
		{
			System.out.print(j+" ");
		}
		System.out.print("*");
		System.out.println();
	}
}
}