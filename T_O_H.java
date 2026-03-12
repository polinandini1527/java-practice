class T_O_H
{
static void t_o_h(int n,char source,char aux,char target)
{
  if(n==1)
  {
    System.out.println("Move disk 1 from"+source+ "to"+target);
	return ;
  }
  t_o_h(n-1,source,target,aux);
  System.out.println("Move disk "+n+ " from"+source+ "to"+target);
  t_o_h(n-1,aux,source,target);
}
public static void main(String []args)
{
	int n=3;
	t_o_h(n,'A','B','C');
}
} 
 