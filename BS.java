class BS
{
 public static void main(String []args)
 {
	 int [] a={50,30,40,10,20};
	 for(int i=0;i<a.length;i++)
	 {
		 for( int j=0;j<a.length-1;j++)
		 {
			 if(a[j]>a[j+1])
			 {
				 int temp=a[j];
				 a[j]=a[j+1];
				 a[j+1]=temp;
			 }
		 }
	 }
	 for(int ab: a)
	 {
		 System.out.print(ab);
	 }
 }
}