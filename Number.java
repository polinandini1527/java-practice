import java.util.Scanner;
class Number{
public static void main(String[] args)
{
  Scanner  sc=new Scanner(System.in);
    int n;
	System.out.println("enter a valid odd number");
	n=sc.nextInt();
	if(n%2==0)
	{
	    return;
	}
	int rows=(n+1)/2;
	for(int i=1;i<=rows;i++)
	{
		for(int j=1;j<=n;j++)
		{
			if(i==j || j==n-i+1)
			{
				System.out.print(j);
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}