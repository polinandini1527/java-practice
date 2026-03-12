import java.util.*;
class Com1{
static void Combination2(int [] a,int index,int target,String p)
{
 if(target==0)
 {
	 System.out.println(p);
	 return;
 }
 for(int i=index;i<a.length;i++)
 {
 if(i>index && a[i]==a[i-1])
 {
	 continue;
}	 
if(a[i]>target)
  break;
 Combination2(a,i+1,target-a[i],p+a[i]+" "); 
}
}
public static void main(String [] args)
{
	int a[]={2,3,4,5,6,7,2};
	int target=8;
	Arrays.sort(a);
	Combination2(a,0,target," ");
	}
}