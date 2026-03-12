class Com{
static void Combination1(int [] a,int index,int target,String p)
{
 if(target==0)
 {
	 System.out.println(p);
	 return;
 }
 if(index==a.length || target<0)
	 return; 
 Combination1(a,index,target-a[index],p+a[index]+" "); 
 Combination1(a,index+1,target,p);
}
public static void main(String [] args)
{
	int a[]={2,4,8,7,6,1};
	int target=8;
	Combination1(a,0,target," ");
	}
}