import java.util.*;
public class Solution
{
  public static int divide(int dividend,int divisor)
  {
    if(dividend==Integer.MIN_VALUE&&divisor==-1)
      return Integer.MAX_VALUE;
    long a=Math.abs((long)dividend);
    long b=Math.abs((long)divisor);
    int sign=(dividend<0)^(divisor<0)?-1:1;
    long quotient=0;
    while(a>=b)
    {
      long temp=b;
      long multiple=1;
      while(a>=temp+temp)
      {
        temp+=temp;
        multiple+=multiple;
      }
      a-=temp;
      quotient+=multiple;
    }
    return(int)(sign*quotient);
  }
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int dividend=sc.nextInt();
  int divisor=sc.nextInt();
  System.out.println(divide(dividend,divisor));
}
}
