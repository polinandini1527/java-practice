class SS{
   static boolean subSet(int []a,int n,int target)
   {
    if(target==0)
	{
	return true;
	}
	if(n==0)
	{
	return false;
	}
	if(a[n-1] > target)
	   return subSet(a,n-1,target);
	return subSet(a,n-1,target)|| subSet(a,n-1,target-a[n-1]);
   }
	 public static void main(String []args)
	 {
	 int a[]={2,3,4,5,6,7};
	 int target=45;
	 System.out.println(subSet(a,a.length,target));
	 }
}