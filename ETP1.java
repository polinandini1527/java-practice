import java.util.*;
class ETP1
{
  public static void printpattern(int n)
  {
   int i,j;
   for(i=0;i<=n;i++)
   {
     for(j=0;j<=n-i;j++)
	 {
	   System.out.print( "  ");
	   }
	   for(j=1;j<=i;j++)
	   {
	    System.out.print( " *    ");
		}
		System.out.println();
	}
}
public static void main(String args[])
{
	int n=6;
	printpattern(n);
}
}