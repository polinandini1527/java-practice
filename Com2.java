import java.util.*;
class Com2{
static void Combination3(int [] a,int index, int k,int target,String p)
{
 if( k==0 && target==0)
 {
	 System.out.println(p);
	 return;
 }
 if( target <0)
 {
  return;
 }
 for(int i=index;i<a.length;i++)
 {
 
 Combination3(a,i+1,k-1,target-a[i],p+a[i]+" "); 
}
}
public static void main(String [] args)
{
	int a[]={2,3,4,5,6,7,2};
	Arrays.sort(a);
	Combination3(a,0,3,9," ");
	}
}